package com.tienda.mintic.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tienda.mintic.dao.ClienteDao;
import com.tienda.mintic.model.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	private ClienteDao clientedao;
	
	@Override
	public Iterable<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clientedao.findAll();
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		// TODO Auto-generated method stub
		return clientedao.findById(id);
	}

	@Override
	public Cliente save(Cliente clientes) {
		// TODO Auto-generated method stub
		return clientedao.save(clientes);
	}

	@Override
	public void delete(Long id) {
		clientedao.deleteById(id);
		
	}

	
	
}
