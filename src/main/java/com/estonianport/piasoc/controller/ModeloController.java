package com.estonianport.piasoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estonianport.piasoc.commons.data.GeneralPath;
import com.estonianport.piasoc.model.Marca;
import com.estonianport.piasoc.model.Modelo;
import com.estonianport.piasoc.model.TipoVehiculo;
import com.estonianport.piasoc.service.MarcaService;
import com.estonianport.piasoc.service.ModeloService;
import com.estonianport.piasoc.service.TipoVehiculoService;

@Controller
public class ModeloController {

	@Autowired
	private ModeloService modeloService;
	
	@Autowired
	private TipoVehiculoService tipoVehiculoService;
	
	@Autowired
	private MarcaService marcaService;

	@RequestMapping("/abmModelo")
	public String abm(Model model) {
		List<Modelo> modelos = modeloService.getAll();
		for (Modelo modelo : modelos) {
			if(modelo.getAnio_hasta() == null) {
				modelo.setAnio_hasta(2021);
		    }
		}
		model.addAttribute("listaModelo", modelos);
		return GeneralPath.MODELO + GeneralPath.PATH_SEPARATOR + GeneralPath.ABM_MODELO;
	}

	@GetMapping("/saveModelo/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		List<TipoVehiculo> listaTipoVehiculo = tipoVehiculoService.getAll();
		model.addAttribute("listaTipoVehiculo", listaTipoVehiculo);
		
		List<Marca> listaMarca = marcaService.getAll();
		model.addAttribute("listaMarca", listaMarca);
		
		if(id != null && id != 0) {
			model.addAttribute("modelo", modeloService.get(id));
		}else {
			model.addAttribute("modelo", new Modelo());
		}
		return GeneralPath.MODELO + GeneralPath.PATH_SEPARATOR + GeneralPath.SAVE_MODELO;
	}

	@PostMapping("/saveModelo")
	public String save(Modelo modelo, Model model) {
		modeloService.save(modelo);
		return GeneralPath.REDIRECT +  GeneralPath.ABM_MODELO;
	}

	@GetMapping("/deleteModelo/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		modeloService.delete(id);
		return GeneralPath.REDIRECT + GeneralPath.ABM_MODELO;
	}

}