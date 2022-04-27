package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		
		System.out.println("Type the Student Data: ");
		System.out.print("Name: ");
		std.name = sc.nextLine();
		System.out.println("Grades: ");
		std.grade1 = sc.nextDouble();
		std.grade2 = sc.nextDouble();
		std.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("FINAL GRADE = " + String.format("%.2f", std.finalGrade()));
		System.out.println(std.approval());
		
		sc.close();
	}

}
