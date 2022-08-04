package com.estonianport.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.estonianport.piasoc.commons.genericService.GenericServiceImpl;
import com.estonianport.piasoc.dao.SexoDao;
import com.estonianport.piasoc.model.Sexo;
import com.estonianport.piasoc.service.SexoService;

@Service
public class SexoServiceImpl extends GenericServiceImpl<Sexo, Long> implements SexoService{

	@Autowired
	private SexoDao sexoDao;

	@Override
	public CrudRepository<Sexo, Long> getDao() {
		return sexoDao;
	}
}
