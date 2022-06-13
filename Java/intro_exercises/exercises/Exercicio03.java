package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
				
		System.out.println("Digite 4 números:");
		A = sc.nextInt(); 
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = A * B - C * D;
		
		System.out.println("DIFERENÇA = " + diferenca);
		
		sc.close();
	}

}
