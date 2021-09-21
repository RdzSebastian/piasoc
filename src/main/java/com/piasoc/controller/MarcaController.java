package com.piasoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.piasoc.model.Marca;
import com.piasoc.service.MarcaService;

@Controller
public class MarcaController {
	
	@Autowired
	private MarcaService marcaService;
	
	@RequestMapping("/abmMarca")
	public String abmMarca(Model model) {
		model.addAttribute("listaMarca", marcaService.getAll());
		return "abmMarca";
	}
	
	@GetMapping("/saveMarca/{id}")
	public String showSaveMarca(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("marca", marcaService.get(id));
		}else {
			model.addAttribute("marca", new Marca());
		}
		return "saveMarca";
	}
	
	@PostMapping("/saveMarca")
	public String saveMarca(Marca marca, Model model) {
		marcaService.save(marca);
		return "redirect:/abmMarca";
	}

	@GetMapping("/deleteMarca/{id}")
	public String deleteMarca(@PathVariable("id") Long id, Model model) {
		marcaService.delete(id);
		return "redirect:/abmMarca";
	}
}
