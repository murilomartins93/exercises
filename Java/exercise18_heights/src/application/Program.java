package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%nDados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			list.add(new Person(name, age, height));
		}
		
		double sum = 0.0;
		int count = 0;
		for (Person x : list) {
			sum += x.getHeight();
			if (x.getAge() < 16) {
				count++;
			}
		}
		
		double avg = (double) sum / list.size(); 
		double percentage = (double) count / list.size() * 100; 
		
		System.out.printf("%nAltura média: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentage);
		
		for (Person x : list) {
			if (x.getAge() < 16) {
				System.out.println(x.getName());
			}
		}
		
		sc.close();
	}

}
