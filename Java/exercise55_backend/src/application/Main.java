package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import services.BrazilTaxService;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		TaxService ts = new BrazilTaxService();
		PensionService ps = new PensionService();
		
		SalaryService salary = new SalaryService(ts, ps);
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Salario bruto: ");
		double grossSalary = sc.nextDouble();
		
		Employee emp = new Employee(name, grossSalary);
		
		System.out.println(salary.netSalary(emp));

		sc.close();

	}

}