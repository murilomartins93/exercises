package exercises;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Digite a senha: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.print("Senha Inv�lida. Digite novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		
		sc.close();
	}

}
