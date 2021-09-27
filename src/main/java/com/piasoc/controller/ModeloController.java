package com.piasoc.controller;

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

import com.piasoc.commons.GeneralPath;
import com.piasoc.model.Marca;
import com.piasoc.model.Modelo;
import com.piasoc.model.TipoVehiculo;
import com.piasoc.service.ModeloService;

@Controller
public class ModeloController {

	@Autowired
	private ModeloService modeloService;

	@RequestMapping("/abmModelo")
	public String abm(Model model) {
		List<Modelo> modelos = modeloService.getAll();
		for (Modelo modelo : modelos) {
			if(modelo.getAnio_hasta() == null) {
				modelo.setAnio_hasta(2021);
		    }
		}
		model.addAttribute("listaModelo", modelos);
		return GeneralPath.MODELO + GeneralPath.PATH_SEPARATOR + "abmModelo";
	}

	@GetMapping("/saveModelo/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		List<Modelo> modelos = modeloService.getAll();

		List<TipoVehiculo> tiposVehiculos = modelos.stream().map(Modelo::getTipoVehiculo).collect(Collectors.toList());
		List<String> tiposVehiculosS = tiposVehiculos.stream().map(TipoVehiculo::getNombre).collect(Collectors.toList());
		Set<String> tiposVehiculosSet = new HashSet<String>(tiposVehiculosS);
		model.addAttribute("tipos", tiposVehiculos);
		
		List<Marca> marcas = modelos.stream().map(Modelo::getMarca).collect(Collectors.toList());
		List<String> marcasS = marcas.stream().map(Marca::getNombre).collect(Collectors.toList());
		Set<String> marcasSet = new HashSet<String>(marcasS);
		model.addAttribute("marcas", marcas);
		
		if(id != null && id != 0) {
			model.addAttribute("modelo", modeloService.get(id));
		}else {
			model.addAttribute("modelo", new Modelo());
		}
		return GeneralPath.MODELO + GeneralPath.PATH_SEPARATOR + "saveModelo";
	}

	@PostMapping("/saveModelo")
	public String save(Modelo modelo, Model model) {
		modeloService.save(modelo);
		return "redirect:/" +  "abmModelo";
	}

	@GetMapping("/deleteModelo/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		modeloService.delete(id);
		return "redirect:/" + "abmModelo";
	}

}