package exercises;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, fat;
		
		System.out.print("Digite o valor que deseja o fatorial: ");
		N = sc.nextInt();
		
		fat = 1;
		for(int i = 1; i <= N; i++) {
			fat *= i; 
		}
		
		System.out.printf("O fatorial de %d é %d.", N, fat);
		
		sc.close();
	}
}
