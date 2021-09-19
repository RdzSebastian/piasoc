package com.piasoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.piasoc.model.Modelo;
import com.piasoc.service.ModeloService;

@Controller
public class ModeloController {

	@Autowired
	private ModeloService modeloService;

	@RequestMapping("/abmModelo")
	public String abmModelo(Model model) {
		model.addAttribute("list", modeloService.getAll());
		return "abmModelo";
	}

	@GetMapping("/saveModelo/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("modelo", modeloService.get(id));
		}else {
			model.addAttribute("modelo", new Modelo());
		}
		return "saveModelo";
	}

	@PostMapping("/save")
	public String save(Modelo modelo, Model model) {
		modeloService.save(modelo);
		return "redirect:/abmModelo";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		modeloService.delete(id);
		return "redirect:/abmModelo";
	}

}