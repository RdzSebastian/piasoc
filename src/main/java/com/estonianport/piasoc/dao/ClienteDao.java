package com.estonianport.piasoc.dao;

import org.springframework.data.repository.CrudRepository;

import com.estonianport.piasoc.model.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long> {

}
