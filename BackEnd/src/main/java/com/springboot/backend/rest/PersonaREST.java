package com.springboot.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.modelo.Persona;
import com.springboot.backend.service.PersonaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/persona/")
public class PersonaREST {
	
	@Autowired
	private PersonaService perser;
	
	@GetMapping
	private ResponseEntity<List<Persona>> getAllPer() {
		return ResponseEntity.ok(perser.findAll());
	}
}