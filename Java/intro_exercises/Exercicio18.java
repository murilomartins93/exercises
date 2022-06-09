import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um número entre 1 e 1000: ");
		x = sc.nextInt();
		
		for(int i = 0; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
