package exercises;

import java.util.Locale;
import java.util.Scanner;

public class AverageEvenNumbers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		double sum = 0.0;
		int count = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				sum += vect[i];
				count++;
			}
		}
		
		if (count != 0) {
			double avg = sum / count;
			System.out.printf("MEDIA DOS PARES = %.1f", avg);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}

}
