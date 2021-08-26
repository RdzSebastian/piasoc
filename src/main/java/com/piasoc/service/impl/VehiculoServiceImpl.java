package com.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.piasoc.commons.GenericServiceImpl;
import com.piasoc.dao.VehiculoDao;
import com.piasoc.model.Vehiculo;
import com.piasoc.service.VehiculoService;

@Service
public class VehiculoServiceImpl extends GenericServiceImpl<Vehiculo, Long> implements VehiculoService{

	@Autowired
	private VehiculoDao vehiculoDao;

	@Override
	public CrudRepository<Vehiculo, Long> getDao() {
		return vehiculoDao;
	}

}
