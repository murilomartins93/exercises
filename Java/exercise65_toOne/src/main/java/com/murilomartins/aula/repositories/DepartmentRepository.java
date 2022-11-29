package com.murilomartins.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilomartins.aula.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
