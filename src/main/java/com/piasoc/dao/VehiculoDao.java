package com.piasoc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.piasoc.model.Vehiculo;

public interface VehiculoDao extends CrudRepository<Vehiculo, Long> {
	
	List<Vehiculo> findByTipo(String tipo);
}
