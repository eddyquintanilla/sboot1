package com.registro.iglesia.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro.iglesia.modelo.Persona;
import com.registro.iglesia.repositorio.PersonaRepositorio;

@RestController
@RequestMapping("api/v1/")
public class PersonaControlador {
	@Autowired
	private PersonaRepositorio repositorio;

	@GetMapping("/personas")
	public List<Persona> ListarTodasLasPersonas() {
		return repositorio.findAll();
	}
}
