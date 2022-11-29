package com.murilomartins.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murilomartins.aula.dto.PersonDepartmentDTO;
import com.murilomartins.aula.entities.Department;
import com.murilomartins.aula.entities.Person;
import com.murilomartins.aula.repositories.DepartmentRepository;
import com.murilomartins.aula.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
		
		// Department dept = new Department();
		// dept.setId(dto.getDepartment().getId());
		Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());
		
		entity.setDepartment(dept);
		
		entity = repository.save(entity);
		
		return new PersonDepartmentDTO(entity);
	}
		
}
