package com.piasoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.piasoc.commons.GeneralPath;
import com.piasoc.model.Modelo;
import com.piasoc.service.ModeloService;

@Controller
public class ModeloController {

	@Autowired
	private ModeloService modeloService;

	@RequestMapping("/abmModelo")
	public String abm(Model model) {
		model.addAttribute("listaModelo", modeloService.getAll());
		return GeneralPath.MODELO + GeneralPath.PATH_SEPARATOR + "abmModelo";
	}

	@GetMapping("/saveModelo/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("modelo", modeloService.get(id));
		}else {
			model.addAttribute("modelo", new Modelo());
		}
		return GeneralPath.MODELO + GeneralPath.PATH_SEPARATOR + "saveModelo";
	}

	@PostMapping("/saveModelo")
	public String savE(Modelo modelo, Model model) {
		modeloService.save(modelo);
		return "redirect:/" + GeneralPath.MODELO + GeneralPath.PATH_SEPARATOR +  "abmModelo";
	}

	@GetMapping("/deleteModelo/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		modeloService.delete(id);
		return "redirect:/" + GeneralPath.MODELO + GeneralPath.PATH_SEPARATOR + "abmModelo";
	}

}