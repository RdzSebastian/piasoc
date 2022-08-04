package com.estonianport.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.estonianport.piasoc.commons.genericService.GenericServiceImpl;
import com.estonianport.piasoc.dao.IntervaloKilometrosDao;
import com.estonianport.piasoc.model.IntervaloKilometros;
import com.estonianport.piasoc.service.IntervaloKilometrosService;

@Service
public class IntervaloKilometrosServiceImpl  extends GenericServiceImpl<IntervaloKilometros, Long> implements IntervaloKilometrosService{

	@Autowired
	private IntervaloKilometrosDao intervaloKilometrosDao;

	@Override
	public CrudRepository<IntervaloKilometros, Long> getDao() {
		return intervaloKilometrosDao;
	}
}
