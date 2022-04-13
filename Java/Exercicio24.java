import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, pow2, pow3;
		
		System.out.print("Digite um número positivo: ");
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			pow2 = (int)Math.pow(i, 2);
			pow3 = (int)Math.pow(i, 3);
			System.out.printf("%d %d %d%n", i, pow2, pow3);
		}

		sc.close();
	}

}
