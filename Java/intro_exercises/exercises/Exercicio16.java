package exercises;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Digite a coordenada X e Y: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro\n");
			} else if(x < 0 && y > 0) {
				System.out.println("Segundo\n");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro\n");
			} else {
				System.out.println("Quarto\n");
			}
			System.out.print("Digite nova coordenada X e Y: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}

}
