package com.piasoc.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.piasoc.model.Modelo;
import com.piasoc.model.Vehiculo;
import com.piasoc.service.ModeloService;
import com.piasoc.service.VehiculoService;


@Controller
public class VehiculoController {


	@Autowired
	private VehiculoService vehiculoService;

	@Autowired
	private ModeloService modeloService;
	
	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("/cotizacion")
	public String cotizacion(Model model) {
		
		List<Vehiculo> vehiculos = vehiculoService.getAll();
		
		List<String> tipos = vehiculos.stream().map(Vehiculo::getTipo).collect(Collectors.toList());
		Set<String> setTipos = new HashSet<String>(tipos);
		model.addAttribute("tipos", setTipos);
	

		List<String> marcas = vehiculos.stream().map(Vehiculo::getMarca).collect(Collectors.toList());
		Set<String> setMarcas = new HashSet<String>(marcas);
		model.addAttribute("marcas", setMarcas);
		
		List<Modelo> modelo = vehiculos.stream().map(Vehiculo::getModelo).collect(Collectors.toList());
		List<String> modelos = modelo.stream().map(Modelo::getNombre).collect(Collectors.toList());

		model.addAttribute("modelos", modelos);
		
		List<Integer> anio = new ArrayList<Integer>();
		anio.add(2021);
		anio.add(2020);
		anio.add(2019);
		model.addAttribute("anios", anio);
		return "cotizacion";
	}

	@RequestMapping("/abmVehiculo")
	public String abmVehiculo(Model model) {
		model.addAttribute("listaVehiculo", vehiculoService.getAll());
		return "abmVehiculo";
	}

	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("vehiculo", vehiculoService.get(id));
			model.addAttribute("modelo", modeloService.get(id));
		}else {
			model.addAttribute("vehiculo", new Vehiculo());
			model.addAttribute("modelo", new Modelo());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Vehiculo vehiculo, Modelo modelo, Model model) {
		modeloService.save(modelo);
		modeloService.get(modelo.getId());
		vehiculoService.save(vehiculo);
		return "redirect:/abmVehiculo";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		vehiculoService.delete(id);
		return "redirect:/abmVehiculo";
	}

}



