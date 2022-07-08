package com.estonianport.piasoc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estonianport.piasoc.commons.GeneralPath;
import com.estonianport.piasoc.email.EmailService;
import com.estonianport.piasoc.model.Cotizacion;
import com.estonianport.piasoc.model.DatosVehiculo;
import com.estonianport.piasoc.model.IntervaloEdad;
import com.estonianport.piasoc.model.IntervaloKilometros;
import com.estonianport.piasoc.model.Sexo;
import com.estonianport.piasoc.service.ClienteService;
import com.estonianport.piasoc.service.CotizacionService;
import com.estonianport.piasoc.service.DatosVehiculoService;
import com.estonianport.piasoc.service.IntervaloEdadService;
import com.estonianport.piasoc.service.IntervaloKilometrosService;
import com.estonianport.piasoc.service.ModeloService;
import com.estonianport.piasoc.service.SexoService;
import com.estonianport.piasoc.service.TipoVehiculoService;

@Controller
public class MainController {

	@Autowired
	private ModeloService modeloService;

	@Autowired
	private TipoVehiculoService tipoVehiculoService;

	@Autowired
	private CotizacionService cotizacionService;

	@Autowired
	private IntervaloKilometrosService intervaloKilometrosService;

	@Autowired
	private IntervaloEdadService intervaloEdadService;

	@Autowired
	private SexoService sexoService;

	@Autowired
	private DatosVehiculoService datosVehiculoService;

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private EmailService emailService;

	@RequestMapping("/seleccionarVehiculo")
	public String seleccionarVehiculo(Model model) {

		model.addAttribute("listaTipoVehiculo", tipoVehiculoService.getAll());

		int firstYear = 1990;
		int currentYear = LocalDate.now().getYear();
		List<Integer> anios = new ArrayList<Integer>();

		for(int i=firstYear;i<=currentYear;i++){
			anios.add(i);
		}
		model.addAttribute("anios", anios);

		model.addAttribute("datosVehiculo", new DatosVehiculo());

		return "pages/seleccionarVehiculo";
	}

	@RequestMapping("/cotizacion/{id}")
	public String cotizacion(@PathVariable("id") Long id, DatosVehiculo datosVehiculo, Model model, HttpSession session) {

		List<IntervaloKilometros> listaIntervaloKilometros = intervaloKilometrosService.getAll();
		model.addAttribute("listaIntervaloKilometros", listaIntervaloKilometros);

		List<IntervaloEdad> listaIntervaloEdad = intervaloEdadService.getAll();
		model.addAttribute("listaIntervaloEdad", listaIntervaloEdad);

		List<Sexo> listaSexo = sexoService.getAll();
		model.addAttribute("listaSexo", listaSexo);

		session.setAttribute("datosVehiculo", datosVehiculo);
		model.addAttribute("cotizacion", new Cotizacion());

		return "pages/cotizacion";
	}

	@RequestMapping("/saveCotizacion")
	public String saveCotizacion(Cotizacion cotizacion, Model model, HttpSession session) {
		DatosVehiculo datosVehiculo = (DatosVehiculo) session.getAttribute("datosVehiculo");
		cotizacion.getDatosVehiculo().setModelo(modeloService.get(datosVehiculo.getModelo().getId()));

		datosVehiculoService.save(cotizacion.getDatosVehiculo());
		clienteService.save(cotizacion.getCliente());
		cotizacionService.save(cotizacion);

		modeloService.get(datosVehiculo.getModelo().getId());

		emailService.enviarMailComprabanteReserva(cotizacion);
		return GeneralPath.REDIRECT;
	}

	@RequestMapping("/seguros")
	public String seguros(Model model) {
		return "pages/seguros";
	}

}
