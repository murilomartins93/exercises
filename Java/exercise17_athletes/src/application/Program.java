package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		double totalWeight = 0.0;
		double tall = 0.0;
		double womenHeight = 0.0;
		String taller = " ";
		
		System.out.print("Qual a quantidade de atletas? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("Digite os dados do atleta número %d:%n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
		// Sex	
			System.out.print("Sexo: ");
			char sex = sc.next().charAt(0);
			
			while (sex != 'F' && sex != 'M') {
				System.out.print("Valor inválido! Favor digitar F ou M: ");
				sex = sc.next().charAt(0);
			}	
			
		// Height 			
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			while (height <= 0) {
				System.out.print("Valor inválido! Favor digitar um valor positivo: ");
				height = sc.nextDouble();
			}
			
			if (height > tall) {
				taller = name;
				tall = height;
			}
			
			if (sex == 'M') {
				count++;
			} else {
				womenHeight += height;
			}
			
		// Weight 			
			System.out.print("Peso: ");
			double weight = sc.nextDouble();
			
			while (weight <= 0) {
				System.out.print("Valor inválido! Favor digitar um valor positivo: ");
				weight = sc.nextDouble();
			}
			
			totalWeight += weight;
		}
		
		double medWeight = totalWeight / n;
		double menPercentage = (double)count / n * 100;
		
		System.out.println("\nRELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n", medWeight);
		System.out.printf("Atleta mais alto: %s%n", taller);
		System.out.printf("Porcentagem de homens: %.1f %%%n", menPercentage);
		
		if (womenHeight != 0) {
			double medWomenHeight = womenHeight / (n - count);
			System.out.printf("Altura média das mulheres: %.2f", medWomenHeight);
		}
		else {
			System.out.printf("Não há mulheres cadastradas");
		}		
		
		sc.close();
	}
}