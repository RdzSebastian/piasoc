package com.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.piasoc.commons.GenericServiceImpl;
import com.piasoc.dao.TipoVehiculoDao;
import com.piasoc.model.TipoVehiculo;
import com.piasoc.service.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl extends GenericServiceImpl<TipoVehiculo, Long> implements TipoVehiculoService{

	@Autowired
	private TipoVehiculoDao tipoVehiculoDao;

	@Override
	public CrudRepository<TipoVehiculo, Long> getDao() {
		return tipoVehiculoDao;
	}
}
