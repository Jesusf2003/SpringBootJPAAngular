package com.springboot.backend.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;

import com.springboot.backend.modelo.Producto;
import com.springboot.backend.repository.ProductoRepository;

public class ProductoService implements ProductoRepository {
	
	@Autowired
	private ProductoRepository prodrep;

	@Override
	public List<Producto> findAll() {
		return prodrep.findAll();
	}

	@Override
	public List<Producto> findAll(Sort sort) {
		return prodrep.findAll(sort);
	}

	@Override
	public List<Producto> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Override
	public <S extends Producto> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public void flush() {
	}

	@Override
	public <S extends Producto> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Producto> entities) {
	}

	@Override
	public void deleteAllInBatch() {
	}

	@Override
	public Producto getOne(Long id) {
		return null;
	}

	@Override
	public <S extends Producto> List<S> findAll(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Producto> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Override
	public Page<Producto> findAll(Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Producto> S save(S entity) {
		return null;
	}

	@Override
	public Optional<Producto> findById(Long id) {
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
	}

	@Override
	public void delete(Producto entity) {
		prodrep.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Producto> entities) {
	}

	@Override
	public void deleteAll() {
	}

	@Override
	public <S extends Producto> Optional<S> findOne(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Producto> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Producto> long count(Example<S> example) {
		return 0;
	}

	@Override
	public <S extends Producto> boolean exists(Example<S> example) {
		return false;
	}
}