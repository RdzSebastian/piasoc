package com.piasoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.piasoc.commons.GeneralPath;
import com.piasoc.model.TipoVehiculo;
import com.piasoc.service.TipoVehiculoService;

@Controller
public class TipoVehiculoController {

	@Autowired
	private TipoVehiculoService tipoVehiculoService;

	@RequestMapping("/abmTipoVehiculo")
	public String abm(Model model) {
		model.addAttribute("listaTipoVehiculo", tipoVehiculoService.getAll());
		return GeneralPath.TIPO_VEHICULO + GeneralPath.PATH_SEPARATOR +  "abmTipoVehiculo";
	}

	@GetMapping("/saveTipoVehiculo/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("tipoVehiculo", tipoVehiculoService.get(id));
		}else {
			model.addAttribute("tipoVehiculo", new TipoVehiculo());
		}
		return GeneralPath.TIPO_VEHICULO + GeneralPath.PATH_SEPARATOR + "saveTipoVehiculo";
	}

	@PostMapping("/saveTipoVehiculo")
	public String save(TipoVehiculo vehiculo, Model model) {
		tipoVehiculoService.save(vehiculo);
		return "redirect:/" + "abmTipoVehiculo";
	}

	@GetMapping("/deleteTipoVehiculo/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		tipoVehiculoService.delete(id);
		return "redirect:/" + "abmTipoVehiculo";
	}

}