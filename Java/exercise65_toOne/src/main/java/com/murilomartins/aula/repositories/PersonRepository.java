package com.murilomartins.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilomartins.aula.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
