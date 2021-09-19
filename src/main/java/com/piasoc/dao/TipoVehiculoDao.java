package com.piasoc.dao;

import org.springframework.data.repository.CrudRepository;

import com.piasoc.model.TipoVehiculo;

public interface TipoVehiculoDao extends CrudRepository<TipoVehiculo, Long> {
	
}
