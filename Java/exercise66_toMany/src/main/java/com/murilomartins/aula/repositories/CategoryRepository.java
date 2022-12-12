package com.murilomartins.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilomartins.aula.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
