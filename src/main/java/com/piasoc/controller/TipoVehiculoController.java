package com.piasoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.piasoc.model.TipoVehiculo;
import com.piasoc.service.TipoVehiculoService;

@Controller
public class TipoVehiculoController {

	@Autowired
	private TipoVehiculoService tipoVehiculoService;

	@RequestMapping("/abmTipoVehiculo")
	public String abmTipoVehiculo(Model model) {
		model.addAttribute("list", tipoVehiculoService.getAll());
		return "abmTipoVehiculo";
	}

	@GetMapping("/saveTipoVehiculo/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("vehiculo", tipoVehiculoService.get(id));
		}else {
			model.addAttribute("vehiculo", new TipoVehiculo());
		}
		return "saveTipoVehiculo";
	}

	@PostMapping("/save")
	public String save(TipoVehiculo vehiculo, Model model) {
		tipoVehiculoService.save(vehiculo);
		return "redirect:/abmTipoVehiculo";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		tipoVehiculoService.delete(id);
		return "redirect:/abmTipoVehiculo";
	}

}