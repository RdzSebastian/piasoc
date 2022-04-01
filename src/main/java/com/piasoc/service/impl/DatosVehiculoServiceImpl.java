package com.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.piasoc.commons.GenericServiceImpl;
import com.piasoc.dao.DatosVehiculoDao;
import com.piasoc.model.DatosVehiculo;
import com.piasoc.service.DatosVehiculoService;

@Service
public class DatosVehiculoServiceImpl  extends GenericServiceImpl<DatosVehiculo, Long> implements DatosVehiculoService{

	@Autowired
	private DatosVehiculoDao datosVehiculoDao;

	@Override
	public CrudRepository<DatosVehiculo, Long> getDao() {
		return datosVehiculoDao;
	}
}
