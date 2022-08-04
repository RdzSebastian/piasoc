package com.estonianport.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.estonianport.piasoc.commons.genericService.GenericServiceImpl;
import com.estonianport.piasoc.dao.TipoVehiculoDao;
import com.estonianport.piasoc.model.TipoVehiculo;
import com.estonianport.piasoc.service.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl extends GenericServiceImpl<TipoVehiculo, Long> implements TipoVehiculoService{

	@Autowired
	private TipoVehiculoDao tipoVehiculoDao;

	@Override
	public CrudRepository<TipoVehiculo, Long> getDao() {
		return tipoVehiculoDao;
	}
}
