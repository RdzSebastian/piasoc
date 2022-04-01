package com.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.piasoc.commons.GenericServiceImpl;
import com.piasoc.dao.SexoDao;
import com.piasoc.model.Sexo;
import com.piasoc.service.SexoService;

@Service
public class SexoServiceImpl extends GenericServiceImpl<Sexo, Long> implements SexoService{

	@Autowired
	private SexoDao sexoDao;

	@Override
	public CrudRepository<Sexo, Long> getDao() {
		return sexoDao;
	}
}
