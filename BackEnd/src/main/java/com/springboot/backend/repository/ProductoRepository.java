package com.springboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.backend.modelo.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}