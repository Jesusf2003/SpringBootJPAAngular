package com.springboot.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.springboot.backend.modelo.Persona;
import com.springboot.backend.repository.PersonaRepository;

@Service
public class PersonaService implements PersonaRepository {
	
	@Autowired
	private PersonaRepository perrep;

	@Override
	public List<Persona> findAll() {
		return perrep.findAll();
	}

	@Override
	public List<Persona> findAll(Sort sort) {
		return null;
	}

	@Override
	public List<Persona> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Override
	public <S extends Persona> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public void flush() {
	}

	@Override
	public <S extends Persona> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Persona> entities) {
	}

	@Override
	public void deleteAllInBatch() {
	}

	@Override
	public Persona getOne(Long id) {
		return null;
	}

	@Override
	public <S extends Persona> List<S> findAll(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Persona> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Override
	public Page<Persona> findAll(Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Persona> S save(S entity) {
		return perrep.save(entity);
	}

	@Override
	public Optional<Persona> findById(Long id) {
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		return false;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		perrep.deleteById(id);
	}

	@Override
	public void delete(Persona entity) {
	}

	@Override
	public void deleteAll(Iterable<? extends Persona> entities) {
	}

	@Override
	public void deleteAll() {
	}

	@Override
	public <S extends Persona> Optional<S> findOne(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Persona> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Persona> long count(Example<S> example) {
		return 0;
	}

	@Override
	public <S extends Persona> boolean exists(Example<S> example) {
		return false;
	}
}