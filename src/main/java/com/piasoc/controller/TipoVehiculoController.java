package com.piasoc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.piasoc.model.Modelo;
import com.piasoc.model.TipoVehiculo;
import com.piasoc.service.ModeloService;
import com.piasoc.service.TipoVehiculoService;


@Controller
public class TipoVehiculoController {
/*

	@Autowired
	private TipoVehiculoService vehiculoService;

	@Autowired
	private ModeloService modeloService;
	
	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("/cotizacion")
	public String cotizacion(Model model) {
		
		List<TipoVehiculo> vehiculos = vehiculoService.getAll();
		
		//List<String> tipos = vehiculos.stream().map(TipoVehiculo::getTipo).collect(Collectors.toList());
		//Set<String> setTipos = new HashSet<String>(tipos);
		//model.addAttribute("tipos", setTipos);

		/*List<String> marcas = vehiculos.stream().map(Vehiculo::getMarca).collect(Collectors.toList());
		Set<String> setMarcas = new HashSet<String>(marcas);
		model.addAttribute("marcas", setMarcas);
		
		//Se setea luego de elegir el tipo de vehiculo
		List<String> marcas = new ArrayList<String>();
		model.addAttribute("marcas", marcas);
		
		//List<Modelo> modelo = vehiculos.stream().map(TipoVehiculo::getModelo).collect(Collectors.toList());
		//List<String> modelos = modelo.stream().map(Modelo::getNombre).collect(Collectors.toList());

		//model.addAttribute("modelos", modelos);
		
		List<Integer> anio = new ArrayList<Integer>();
		anio.add(2021);
		anio.add(2020);
		anio.add(2019);
		model.addAttribute("anios", anio);
		
		//Para poder usar los metodos del service dentro del thymeleaf de cotizacion
        model.addAttribute("vehiculoService", this);

		return "cotizacion";
	}

	@RequestMapping("/abmVehiculo")
	public String abmVehiculo(Model model) {
		List<TipoVehiculo> vehiculos = vehiculoService.getAll();
		for (TipoVehiculo vehiculo : vehiculos) {
			//if(vehiculo.getModelo().getAnio_hasta() == null) {
		    //	vehiculo.getModelo().setAnio_hasta(2021);
		    //}
		}
		model.addAttribute("listaVehiculo", vehiculoService.getAll());
		return "abmVehiculo";
	}

	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("vehiculo", vehiculoService.get(id));
			model.addAttribute("modelo", modeloService.get(id));
		}else {
			model.addAttribute("vehiculo", new TipoVehiculo());
			model.addAttribute("modelo", new Modelo());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(TipoVehiculo vehiculo, Modelo modelo, Model model) {
		Modelo modeloGuardado = modeloService.save(modelo);
		//vehiculo.setModelo(modeloGuardado);
		vehiculoService.save(vehiculo);
		return "redirect:/abmVehiculo";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		TipoVehiculo vehiculo = vehiculoService.get(id);
		vehiculoService.delete(id);
		//modeloService.delete(vehiculo.getModelo().getId());

		
		return "redirect:/abmVehiculo";
	}
	
	// TODO Dudo mucho que esto se haga asi, estoy tratando de hacer una call
	// a aca para devolver valores al template, pero no estaria funcando
	@RequestMapping(value="/getMarcas", method = RequestMethod.POST)
	public String getMarcas(Model model, HttpSession session,HttpServletRequest request) {
        String tipo= request.getParameter("tipo");
        //List<TipoVehiculo> vehiculos = vehiculoService.findByTipo(tipo);
		//List<String> marcas = vehiculos.stream().map(TipoVehiculo::getMarca).collect(Collectors.toList());
		//Set<String> setMarcas = new HashSet<String>(marcas);
		model.addAttribute("tipos", tipo);
		//model.addAttribute("marcas", setMarcas);
		return "cotizacion";
	}
	
	
	*/


}



