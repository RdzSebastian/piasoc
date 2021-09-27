package com.piasoc.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.piasoc.model.Marca;
import com.piasoc.model.Modelo;
import com.piasoc.model.TipoVehiculo;
import com.piasoc.service.ModeloService;

@Controller
public class MainController {

	@Autowired
	private ModeloService modeloService;

	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}

	@RequestMapping("/cotizacion")
	public String cotizacion(Model model) {

		List<Modelo> modelos = modeloService.getAll();
		List<String> modelosS = modelos.stream().map(Modelo::getNombre).collect(Collectors.toList());
		model.addAttribute("modelos", modelosS);

		List<TipoVehiculo> tiposVehiculos = modelos.stream().map(Modelo::getTipoVehiculo).collect(Collectors.toList());
		List<String> tiposVehiculosS = tiposVehiculos.stream().map(TipoVehiculo::getNombre).collect(Collectors.toList());
		Set<String> tiposVehiculosSet = new HashSet<String>(tiposVehiculosS);
		model.addAttribute("tipos", tiposVehiculosSet);

		List<Marca> marcas = modelos.stream().map(Modelo::getMarca).collect(Collectors.toList());
		List<String> marcasS = marcas.stream().map(Marca::getNombre).collect(Collectors.toList());
		Set<String> marcasSet = new HashSet<String>(marcasS);
		model.addAttribute("marcas", marcasSet);

		List<Integer> anio = new ArrayList<Integer>();
		anio.add(2021);
		anio.add(2020);
		anio.add(2019);
		model.addAttribute("anios", anio);

		return "pages/cotizacion";
	}
	
	@RequestMapping("/seguros")
	public String seguros(Model model) {
		return "pages/seguros";
	}

}
