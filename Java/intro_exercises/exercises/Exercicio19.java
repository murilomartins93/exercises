package exercises;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, X, in, out;
		
		System.out.print("Digite a quantidade de valores que serão digitados: ");
		N = sc.nextInt();
		
		in = 0;
		out = 0;
		
		System.out.println("Digite os números:");
		for(int i = 0; i < N; i++) {
			X = sc.nextInt();
			if(X >= 10 && X <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
