package com.estonianport.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.estonianport.piasoc.commons.genericService.GenericServiceImpl;
import com.estonianport.piasoc.dao.IntervaloEdadDao;
import com.estonianport.piasoc.model.IntervaloEdad;
import com.estonianport.piasoc.service.IntervaloEdadService;

@Service
public class IntervaloEdadServiceImpl  extends GenericServiceImpl<IntervaloEdad, Long> implements IntervaloEdadService{

	@Autowired
	private IntervaloEdadDao intervaloEdadDao;

	@Override
	public CrudRepository<IntervaloEdad, Long> getDao() {
		return intervaloEdadDao;
	}
}
