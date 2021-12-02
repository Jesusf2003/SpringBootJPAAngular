package com.springboot.backend.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.backend.modelo.Persona;
import com.springboot.backend.modelo.Ubigeo;
import com.springboot.backend.service.PersonaService;
import com.springboot.backend.service.UbigeoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/persona")
public class PersonaREST {

	@Autowired
	private PersonaService perser;

	// Listar todos
	@GetMapping
	private ResponseEntity<List<Persona>> getAllPer() {
		return ResponseEntity.ok(perser.findAll());
	}
	
	// Registrar
	@PostMapping
	private ResponseEntity<Persona> savePersona(@RequestBody Persona persona) throws URISyntaxException {
		Persona perSaved = perser.save(persona);
		return ResponseEntity.created(new URI("/persona/" + perSaved.getCodper())).body(perSaved);
	}

	// Modificar (Se puede usar para eliminar por estado)
	@PutMapping
	private ResponseEntity<Persona> updatePersona(@RequestBody Persona persona) {
		Persona perEdit = perser.save(persona);
		return ResponseEntity.ok(perEdit);
	}

	// Eliminar (De la base de datos)
	@DeleteMapping("{id}")
	private ResponseEntity<Persona> deletePersona(@PathVariable Long id) {
		perser.deleteById(id);
		return null;
	}
}