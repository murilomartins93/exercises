package exercises;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod, alcool, gasolina, diesel;

		System.out.print("Informe o código do combustível abastecido ou 4 para encerrar: ");
		cod = sc.nextInt();	
		
		alcool = 0;
		gasolina = 0;
		diesel = 0;

		do {			
			switch (cod) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;	
			default: 
				System.out.println("Código inválido!\n");		
				break;
			}
			System.out.print("Digite um novo código ou 4 para encerrar: ");
			cod = sc.nextInt();
		} while (cod != 4);

		System.out.printf("MUITO OBRIGADO!%n");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);

		sc.close();

	}

}
