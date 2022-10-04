package com.murilomartins.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murilomartins.entities.Employee;

@Service
public class SalaryService {

	@Autowired
	private TaxService taxService;
	@Autowired
	private PensionService pensionService;
	
	public double netSalary(Employee emp) {	
		return emp.getGrossSalary() - taxService.tax(emp.getGrossSalary()) - pensionService.discount(emp.getGrossSalary());
	}
}
