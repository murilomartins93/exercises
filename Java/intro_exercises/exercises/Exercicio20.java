package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double x1, x2, x3, media;		
		
		System.out.print("Digite o número de casos: ");
		N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.printf("Digite os 3 números do %dº caso: ", i+1);
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			x3 = sc.nextDouble();
			
			media = ((x1 * 2) + (x2 * 3) + (x3 * 5)) / 10;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
