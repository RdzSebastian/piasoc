package com.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.piasoc.commons.GenericServiceImpl;
import com.piasoc.dao.IntervaloEdadDao;
import com.piasoc.model.IntervaloEdad;
import com.piasoc.service.IntervaloEdadService;

@Service
public class IntervaloEdadServiceImpl  extends GenericServiceImpl<IntervaloEdad, Long> implements IntervaloEdadService{

	@Autowired
	private IntervaloEdadDao intervaloEdadDao;

	@Override
	public CrudRepository<IntervaloEdad, Long> getDao() {
		return intervaloEdadDao;
	}
}
