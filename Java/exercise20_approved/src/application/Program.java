package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

import entities.Grades;
import entities.Student;

public class Program {
	
    public static void main(String[] args) {
    	
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Student> list = new ArrayList<Student>();
        
        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados do %do aluno:%n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Primeira nota: ");
            double grade1 = sc.nextDouble();
            System.out.print("Segunda nota: ");
            double grade2 = sc.nextDouble();
            list.add(new Student(name, new Grades(grade1), new Grades(grade2)));
        }
        
        System.out.println("\nAlunos aprovados");
        for (Student std : list) {
            if (std.avgGrade() >= 6.0) {
                System.out.println(std.getName());
            }
        }
        
        sc.close();
    }
}