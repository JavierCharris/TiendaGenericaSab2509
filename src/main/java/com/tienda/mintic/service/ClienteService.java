package com.tienda.mintic.service;

import java.util.Optional;

import com.tienda.mintic.model.Cliente;


public interface ClienteService {
	
	public Iterable<Cliente> findAll();
	
	public Optional<Cliente> findById(Long id);
	
	public Cliente save(Cliente clientes);
	
	public void delete(Long id);

}
