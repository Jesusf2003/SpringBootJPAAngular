package com.springboot.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.backend.modelo.Ubigeo;
import com.springboot.backend.service.UbigeoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/ubigeo")
public class UbigeoREST {

	@Autowired
	private UbigeoService ubiserv;

	@GetMapping
	private ResponseEntity<List<Ubigeo>> getAllUbi() {
		return ResponseEntity.ok(ubiserv.findAll());
	}
}