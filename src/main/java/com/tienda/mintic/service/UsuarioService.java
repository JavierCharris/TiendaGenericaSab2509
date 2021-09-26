package com.tienda.mintic.service;

import java.util.Optional;

import com.tienda.mintic.model.Usuario;

public interface UsuarioService {

	public Iterable<Usuario> findAll();
	
	public Optional<Usuario> findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);
		
	
}
