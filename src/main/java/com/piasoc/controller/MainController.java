package com.piasoc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.piasoc.commons.GeneralPath;
import com.piasoc.model.Cotizacion;
import com.piasoc.model.DatosVehiculo;
import com.piasoc.model.IntervaloEdad;
import com.piasoc.model.IntervaloKilometros;
import com.piasoc.model.Modelo;
import com.piasoc.model.Sexo;
import com.piasoc.service.ClienteService;
import com.piasoc.service.CotizacionService;
import com.piasoc.service.DatosVehiculoService;
import com.piasoc.service.IntervaloEdadService;
import com.piasoc.service.IntervaloKilometrosService;
import com.piasoc.service.ModeloService;
import com.piasoc.service.SexoService;

@Controller
public class MainController {

	@Autowired
	private CotizacionService cotizacionService;

	@Autowired
	private IntervaloKilometrosService intervaloKilometrosService;

	@Autowired
	private IntervaloEdadService intervaloEdadService;

	@Autowired
	private ModeloService modeloService;

	@Autowired
	private SexoService SexoService;
	
	@Autowired
	private DatosVehiculoService datosVehiculoService;
	
	@Autowired
	private ClienteService clienteService;

	@RequestMapping("/seleccionarVehiculo")
	public String seleccionarVehiculo(Model model) {

		List<Modelo> modelos = modeloService.getAll();
		for (Modelo modelo : modelos) {
			if(modelo.getAnio_hasta() == null) {
				modelo.setAnio_hasta(2021);
			}
		}
		model.addAttribute("listaModelo", modelos);

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

		List<Sexo> listaSexo = SexoService.getAll();
		model.addAttribute("listaSexo", listaSexo);

		session.setAttribute("datosVehiculo", datosVehiculo);
		model.addAttribute("cotizacion", new Cotizacion());

		return "pages/cotizacion";
	}

	@RequestMapping("/saveCotizacion")
	public String saveCotizacion(Cotizacion cotizacion, Model model, HttpSession session) {
		DatosVehiculo datosVehiculo = (DatosVehiculo) session.getAttribute("datosVehiculo");
		cotizacion.getDatosVehiculo().setModelo(datosVehiculo.getModelo());
		
		datosVehiculoService.save(cotizacion.getDatosVehiculo());
		clienteService.save(cotizacion.getCliente());
		cotizacionService.save(cotizacion);
		return GeneralPath.REDIRECT;
	}

	@RequestMapping("/seguros")
	public String seguros(Model model) {
		return "pages/seguros";
	}

}
