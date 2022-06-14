package exercises;

import java.util.Locale;
import java.util.Scanner;

public class VectorsSum {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectR = new int[n];
			
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vectR.length; i++) {
			vectR[i] = vectA[i] + vectB[i];
		}
		
		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < vectR.length; i++) {
			System.out.println(vectR[i]);
		}
		
		sc.close();
	}

}