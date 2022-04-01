package com.piasoc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.piasoc.commons.GenericServiceImpl;
import com.piasoc.dao.ClienteDao;
import com.piasoc.model.Cliente;
import com.piasoc.service.ClienteService;

@Service
public class ClienteServiceImpl  extends GenericServiceImpl<Cliente, Long> implements ClienteService{

	@Autowired
	private ClienteDao clienteDao;

	@Override
	public CrudRepository<Cliente, Long> getDao() {
		return clienteDao;
	}
}
