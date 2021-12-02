package com.springboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.backend.modelo.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
}