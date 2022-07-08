package com.estonianport.piasoc.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estonianport.piasoc.model.Marca;
import com.estonianport.piasoc.model.Modelo;
import com.estonianport.piasoc.service.ModeloService;

@RestController
@RequestMapping("/api/")
public class RestWebController {

	@Autowired
	private ModeloService modeloService;

	@CrossOrigin(origins = "*")	
	@GetMapping("/buscarMarca")
	public @ResponseBody ResponseEntity<List<Marca>> buscarMarca(Model model, @RequestParam(value="tipoVehiculoId") long tipoVehiculoId){

		List<Modelo> listaModelo = modeloService.getAll();
		Set<Marca> listaMarca = new HashSet<Marca>();
		for(Modelo modelo : listaModelo) {
			if(modelo.getTipoVehiculo().getId() == tipoVehiculoId) {
				listaMarca.add(modelo.getMarca());
			}
		}

		return new ResponseEntity<List<Marca>>(List.copyOf(listaMarca), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/buscarModelo")
	public @ResponseBody ResponseEntity<List<Modelo>> buscarModelo(Model model, @RequestParam(value="tipoVehiculoId") long tipoVehiculoId, @RequestParam(value="marcaId") long marcaId){

		List<Modelo> listaModelo = modeloService.getAll();
		List<Modelo> listaModeloElegido = new ArrayList<Modelo>();

		for(Modelo modelo : listaModelo) {
			if(modelo.getTipoVehiculo().getId() == tipoVehiculoId && modelo.getMarca().getId() == marcaId) {
				listaModeloElegido.add(modelo);
			}
		}

		return new ResponseEntity<List<Modelo>>(listaModeloElegido, HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/buscarAno")
	public @ResponseBody ResponseEntity<List<Modelo>> buscarAno(Model model, @RequestParam(value="marcaId") long marcaId){

		List<Modelo> listaModelo = modeloService.getAll();
		List<Modelo> listaModeloElegido = new ArrayList<Modelo>();

		for(Modelo modelo : listaModelo) {
			if(modelo.getMarca().getId() == marcaId) {
				listaModeloElegido.add(modelo);
			}
		}

		return new ResponseEntity<List<Modelo>>(listaModeloElegido, HttpStatus.OK);
	}

}