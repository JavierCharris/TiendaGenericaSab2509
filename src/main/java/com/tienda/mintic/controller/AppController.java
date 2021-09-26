package com.tienda.mintic.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tienda.mintic.model.Usuario;
import com.tienda.mintic.service.UsuarioService;


@Controller
public class AppController {
		
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/error")
	public String error() {
		return "error";
	}
	
	@GetMapping("/salir")
	public String salir() {
		return "salir";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/usuarios")
	public String usuarios() {
		return "usuarios";
	}
	
	@RequestMapping("/validador")
	public String validador( HttpServletRequest req, HttpServletRequest resp) {
	
		String usuario = req.getParameter("usuario");
		String password = req.getParameter("password");
		
		if(usuario.equals("admininicial") && password.equals("admin12345") ) {
			return "menu";
		}else {
			return "error";
		}		
		
	}

	
	
	
	
	
		
}



	

