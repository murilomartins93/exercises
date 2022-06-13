package exercises;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, troca;
		
		System.out.println("Digite dois números:");
		A = sc.nextInt();
		B = sc.nextInt();
				
		if(B > A) {
			troca = A;
			A = B;
			B = troca;
		}
		
		if(A % B == 0) {
			System.out.println("São Múltiplos");
		}
		else {
			System.out.println("Não são Múltiplos");
		}
		
		sc.close();
	}

}
