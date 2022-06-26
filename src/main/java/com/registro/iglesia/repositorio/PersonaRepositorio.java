package com.registro.iglesia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.iglesia.modelo.Persona;

@Repository 
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {

}
