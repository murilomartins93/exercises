package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Employee;

public class Program {
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<Employee> workers = new ArrayList<Employee>();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%d:%n", (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(workers, id) == true) {
				System.out.print("Invalid ID. Enter another ID: ");
				id = sc.nextInt();
				sc.nextLine();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			workers.add(new Employee(id, name, salary));		
		}
				
		System.out.println();
		System.out.print("Enter the employee id that will hava salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = workers.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee employ : workers) {
			System.out.println(employ);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee result = list
				.stream()
				.filter(x -> x.getId() == id)
				.findFirst()
				.orElse(null);
		return result != null;
	} // if return true, has the id. if false, doesn't has the id.

}

/*  Ao invés, na função hadId(), retornarmos um boolean, poderíamos retornar 
 * o próprio objeto do tipo Employee, dessa maneira iriamos aproveitar quando 
 * fosse atribuir o novo objeto pegando já o valor referenciado pelo id na porcentagem. 
 * A função ficaria mais ou menos assim: 
 * 		
 * 		public static Employee getListEmployeeFiltered(List<Employee> list, int id) {
 * 			return list.stream()
 * 				.filter(employee -> employee.getId() == id)
 * 				.findFirst().orElse(null);
 * 		}
 * 
 * O while ficaria assim:  
 * 
 * 		while(getListEmployeeFiltered(employeeList, id) != null) {
 * 
 * E a atribuição assim: 
 * 
 * 		Employee emp = getListEmployeeFiltered(employeeList, id); 
 */