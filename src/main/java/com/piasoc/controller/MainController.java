package com.piasoc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.piasoc.model.Modelo;
import com.piasoc.service.ModeloService;

@Controller
public class MainController {

	@Autowired
	private ModeloService modeloService;

	@RequestMapping("/")
	public String mantenimiento(Model model) {
		return "mantenimiento";
	}

	@RequestMapping("/index")
	public String index(Model model) {
		return "index";
	}

	@RequestMapping("/seleccionarVehiculo")
	public String seleccionarVehiculo(Model model) {
		
		List<Modelo> modelos = modeloService.getAll();
		for (Modelo modelo : modelos) {
			if(modelo.getAnio_hasta() == null) {
				modelo.setAnio_hasta(2021);
		    }
		}
		model.addAttribute("listaModelo", modelos);
		
		int firstYear = 1990;
		int currentYear = LocalDate.now().getYear();
		List<Integer> anios = new ArrayList<Integer>();

        for(int i=firstYear;i<=currentYear;i++){
        	anios.add(i);
        }
		model.addAttribute("anios", anios);

		return "pages/seleccionarVehiculo";
	}
	
	@RequestMapping("/cotizacion")
	public String cotizacion(Model model) {
		return "pages/cotizacion";
	}
	
	@RequestMapping("/seguros")
	public String seguros(Model model) {
		return "pages/seguros";
	}

}
