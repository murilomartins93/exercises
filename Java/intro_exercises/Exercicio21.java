import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, x, y;
		double div;
		
		System.out.print("Quanto números serão digitados? ");
		N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.printf("Digite o %dº par: ", i+1);
			x = sc.nextInt();
			y = sc.nextInt();
			
			if(y == 0){
				System.out.println("Divisão impossível!");
			} else {
				div = (double) x / y;
				System.out.println(div);
			}
		}

		sc.close();
	}

}
