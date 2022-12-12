package com.murilomartins.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilomartins.aula.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
