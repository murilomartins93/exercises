package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Worker;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Worker> list = new ArrayList<>();
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Worker(fields[0], fields[1], Double.parseDouble(fields[2])));				
				line = br.readLine();
			}
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> emails = list.stream()
					.filter(w -> w.getSalary() > salary)
					.map(w -> w.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			System.out.printf("Email of people whose salary is more than %.2f:%n", salary);
			emails.forEach(System.out::println);
			
			System.out.print("Enter the initial name letter of people whose sum of salary you want: ");
			char initial = sc.next().charAt(0);
			
			double salaries = list.stream()
					.filter(w -> w.getName().charAt(0) == initial)
					.map(w -> w.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.printf("Sum of salary of people whose name starts with '%c': %.2f", initial, salaries);
			
		} 
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	 		
		sc.close();
	}

}
