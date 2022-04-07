package com.estonianport.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.estonianport.piasoc.commons.GenericServiceImpl;
import com.estonianport.piasoc.dao.ModeloDao;
import com.estonianport.piasoc.model.Modelo;
import com.estonianport.piasoc.service.ModeloService;

@Service
public class ModeloServiceImpl extends GenericServiceImpl<Modelo, Long> implements ModeloService{

	@Autowired
	private ModeloDao modeloDao;

	@Override
	public CrudRepository<Modelo, Long> getDao() {
		return modeloDao;
	}

}
