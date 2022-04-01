package com.piasoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.piasoc.commons.GeneralPath;
import com.piasoc.model.Marca;
import com.piasoc.service.MarcaService;

@Controller
public class MarcaController {
	
	@Autowired
	private MarcaService marcaService;
	
	@RequestMapping("/abmMarca")
	public String abm(Model model) {
		model.addAttribute("listaMarca", marcaService.getAll());
		return GeneralPath.MARCA + GeneralPath.PATH_SEPARATOR + GeneralPath.ABM_MARCA;
	}
	
	@GetMapping("/saveMarca/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("marca", marcaService.get(id));
		}else {
			model.addAttribute("marca", new Marca());
		}
		return GeneralPath.MARCA + GeneralPath.PATH_SEPARATOR + GeneralPath.SAVE_MARCA;
	}
	
	@PostMapping("/saveMarca")
	public String save(Marca marca, Model model) {
		marcaService.save(marca);
		return GeneralPath.REDIRECT + GeneralPath.ABM_MARCA;
	}

	@GetMapping("/deleteMarca/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		marcaService.delete(id);
		return GeneralPath.REDIRECT +  GeneralPath.ABM_MARCA;
	}
}
