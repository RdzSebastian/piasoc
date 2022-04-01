package com.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.piasoc.commons.GenericServiceImpl;
import com.piasoc.dao.IntervaloKilometrosDao;
import com.piasoc.model.IntervaloKilometros;
import com.piasoc.service.IntervaloKilometrosService;

@Service
public class IntervaloKilometrosServiceImpl  extends GenericServiceImpl<IntervaloKilometros, Long> implements IntervaloKilometrosService{

	@Autowired
	private IntervaloKilometrosDao intervaloKilometrosDao;

	@Override
	public CrudRepository<IntervaloKilometros, Long> getDao() {
		return intervaloKilometrosDao;
	}
}
