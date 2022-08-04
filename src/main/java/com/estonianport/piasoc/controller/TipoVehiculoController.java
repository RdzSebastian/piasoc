package com.estonianport.piasoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estonianport.piasoc.commons.data.GeneralPath;
import com.estonianport.piasoc.model.TipoVehiculo;
import com.estonianport.piasoc.service.TipoVehiculoService;

@Controller
public class TipoVehiculoController {

	@Autowired
	private TipoVehiculoService tipoVehiculoService;

	@RequestMapping("/abmTipoVehiculo")
	public String abm(Model model) {
		model.addAttribute("listaTipoVehiculo", tipoVehiculoService.getAll());
		return GeneralPath.TIPO_VEHICULO + GeneralPath.PATH_SEPARATOR +  GeneralPath.ABM_TIPO_VEHICULO;
	}

	@GetMapping("/saveTipoVehiculo/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("tipoVehiculo", tipoVehiculoService.get(id));
		}else {
			model.addAttribute("tipoVehiculo", new TipoVehiculo());
		}
		return GeneralPath.TIPO_VEHICULO + GeneralPath.PATH_SEPARATOR + GeneralPath.SAVE_TIPO_VEHICULO;
	}

	@PostMapping("/saveTipoVehiculo")
	public String save(TipoVehiculo vehiculo, Model model) {
		tipoVehiculoService.save(vehiculo);
		return GeneralPath.REDIRECT + GeneralPath.ABM_TIPO_VEHICULO;
	}

	@GetMapping("/deleteTipoVehiculo/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		tipoVehiculoService.delete(id);
		return GeneralPath.REDIRECT + GeneralPath.ABM_TIPO_VEHICULO;
	}

}