package com.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.piasoc.commons.GenericServiceImpl;
import com.piasoc.dao.ModeloDao;
import com.piasoc.model.Modelo;
import com.piasoc.service.ModeloService;

@Service
public class ModeloServiceImpl extends GenericServiceImpl<Modelo, Long> implements ModeloService{

	@Autowired
	private ModeloDao modeloDao;

	@Override
	public CrudRepository<Modelo, Long> getDao() {
		return modeloDao;
	}

}
