package com.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.piasoc.commons.GenericServiceImpl;
import com.piasoc.dao.CotizacionDao;
import com.piasoc.model.Cotizacion;
import com.piasoc.service.CotizacionService;

@Service
public class CotizacionServiceImpl extends GenericServiceImpl<Cotizacion, Long> implements CotizacionService{

	@Autowired
	private CotizacionDao cotizacionDao;

	@Override
	public CrudRepository<Cotizacion, Long> getDao() {
		return cotizacionDao;
	}
}
