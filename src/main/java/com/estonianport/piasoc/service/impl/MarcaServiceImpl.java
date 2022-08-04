package com.estonianport.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.estonianport.piasoc.commons.genericService.GenericServiceImpl;
import com.estonianport.piasoc.dao.MarcaDao;
import com.estonianport.piasoc.model.Marca;
import com.estonianport.piasoc.service.MarcaService;

@Service
public class MarcaServiceImpl  extends GenericServiceImpl<Marca, Long> implements MarcaService{

	@Autowired
	private MarcaDao marcaDao;

	@Override
	public CrudRepository<Marca, Long> getDao() {
		return marcaDao;
	}
}
