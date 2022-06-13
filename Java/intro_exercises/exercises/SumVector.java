package exercises;

import java.util.Locale;
import java.util.Scanner;

public class SumVector {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("\nVALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		
		double sum = 0.0;
		double avg = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		avg = sum / n;
		
		System.out.println("\nSOMA = " + String.format("%.2f", sum));
		System.out.println("MEDIA = " + String.format("%.2f", avg));		
	
		sc.close();
	}

}
