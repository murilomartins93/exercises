package exercises;

import java.util.Locale;
import java.util.Scanner;

public class HighestPos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] number = new double[n];
		double highest = 0.0;
		int pos = 0;
		
		for (int i = 0; i < number.length; i++) {
			System.out.print("Digite um número: ");
			number[i] = sc.nextDouble();
			if (number[i] > highest) {
				highest = number[i];
				pos = i;
			}
		}

		System.out.printf("%nMAIOR VALOR = %.1f%n", number[pos]);
		System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", pos);
	
		sc.close();
	}

}
