package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

import entities.Person;

public class Program {
	
    public static void main(String[] args) {
    	
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Person> list = new ArrayList<Person>();
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double height = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            char gender = sc.next().charAt(0);
            list.add(new Person(height, gender));
        }
        
        double shorter = list.get(0).getHeight();
        double taller = list.get(0).getHeight();
        double sum = 0.0;
        int count = 0;
        
        for (Person p : list) {
            if (p.getHeight() > taller) {
                taller = p.getHeight();
            }
            if (p.getHeight() < shorter) {
                shorter = p.getHeight();
            }
            if (p.getGender() == 'F') {
                sum += p.getHeight();
                count++;
            }
        }
        
        double womenAvg = sum / count;
        int menCount = n - count;
        
        System.out.println("Menor altura = " + String.format("%.2f", shorter));
        System.out.println("Maior altura = " + String.format("%.2f", taller));
        System.out.println("Media das alturas das mulheres = " + String.format("%.2f", womenAvg));
        System.out.println("Numero de homens = " + menCount);
        
        sc.close();
    }
}