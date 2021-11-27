package com.springboot.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.modelo.Ubigeo;
import com.springboot.backend.service.UbigeoService;

@RestController
@RequestMapping("/ubigeo/")
public class UbigeoREST {
	
	@Autowired
	private UbigeoService ubiserv;
	
	@GetMapping
	private ResponseEntity<List<Ubigeo>> getAllUbi() {
		return ResponseEntity.ok(ubiserv.findAll());
	}
}