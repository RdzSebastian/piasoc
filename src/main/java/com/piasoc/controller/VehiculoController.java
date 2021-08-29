package com.piasoc.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.piasoc.model.Vehiculo;
import com.piasoc.service.VehiculoService;


@Controller
public class VehiculoController {


	@Autowired
	private VehiculoService vehiculoService;
	
	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("/cotizacion")
	public String cotizacion(Model model) {
	
		List<Vehiculo> vehiculos = vehiculoService.getAll();
		List marcas = vehiculos.stream().map(Vehiculo::getMarca).collect(Collectors.toList());
		model.addAttribute("marcas", marcas);
		return "cotizacion";
	}

	@RequestMapping("/abmVehiculo")
	public String abmVehiculo(Model model) {
		model.addAttribute("list", vehiculoService.getAll());
		return "abmVehiculo";
	}

	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("vehiculo", vehiculoService.get(id));
		}else {
			model.addAttribute("vehiculo", new Vehiculo());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Vehiculo vehiculo, Model model) {
		vehiculoService.save(vehiculo);
		return "redirect:/abmVehiculo";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		vehiculoService.delete(id);
		return "redirect:/abmVehiculo";
	}

}



