package com.estonianport.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.estonianport.piasoc.commons.GenericServiceImpl;
import com.estonianport.piasoc.dao.ClienteDao;
import com.estonianport.piasoc.model.Cliente;
import com.estonianport.piasoc.service.ClienteService;

@Service
public class ClienteServiceImpl  extends GenericServiceImpl<Cliente, Long> implements ClienteService{

	@Autowired
	private ClienteDao clienteDao;

	@Override
	public CrudRepository<Cliente, Long> getDao() {
		return clienteDao;
	}
}
