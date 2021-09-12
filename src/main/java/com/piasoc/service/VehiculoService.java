package com.piasoc.service;

import java.util.List;

import com.piasoc.commons.GenericService;
import com.piasoc.model.Vehiculo;

public interface VehiculoService extends GenericService<Vehiculo, Long>{

	List<Vehiculo> findByTipo(String tipo);

}
