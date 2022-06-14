package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<Person> list = new ArrayList<>();
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			list.add(new Person(name, age));
		}
		
		int older = 0;
		int pos = 0;
		for (Person p : list) {
			if (p.getAge() > older) {
				pos = list.indexOf(p);
				older = p.getAge();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + list.get(pos).getName());
		
		sc.close();
	}

}