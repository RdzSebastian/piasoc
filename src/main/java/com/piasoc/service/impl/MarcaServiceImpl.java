package com.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.piasoc.commons.GenericServiceImpl;
import com.piasoc.dao.MarcaDao;
import com.piasoc.model.Marca;
import com.piasoc.service.MarcaService;

@Service
public class MarcaServiceImpl  extends GenericServiceImpl<Marca, Long> implements MarcaService{

	@Autowired
	private MarcaDao marcaDao;

	@Override
	public CrudRepository<Marca, Long> getDao() {
		return marcaDao;
	}
}
