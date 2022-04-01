package com.piasoc.dao;

import org.springframework.data.repository.CrudRepository;

import com.piasoc.model.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long> {

}
