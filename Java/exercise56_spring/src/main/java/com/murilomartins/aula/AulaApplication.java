package com.murilomartins.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.murilomartins.entities.Employee;
import com.murilomartins.services.SalaryService;

@SpringBootApplication
@ComponentScan({"com.murilomartins"})
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;
	
	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee emp = new Employee("Maria", 4000);
		System.out.println(salaryService.netSalary(emp));
		
	}

}
