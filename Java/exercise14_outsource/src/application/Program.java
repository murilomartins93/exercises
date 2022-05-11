package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int N = sc.nextInt();
				
		for(int i = 0; i < N; i++) {
			System.out.printf("Employee #%d data:%n", i+1);
			System.out.print("Outsourced (y/n)? ");
			char m = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (m == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				emp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				emp.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for (Employee e : emp) {
			System.out.println(e.getName() 
					+ " - $"
					+ String.format("%.2f", e.payment()));
		}
				
		sc.close();
	}
}