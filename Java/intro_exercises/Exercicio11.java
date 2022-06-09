import java.util.Scanner;
import java.util.Locale;

public class Exercicio11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod, qtd;
		double preco, total;
		String produto;

		System.out.print("Digite o código do produto e a quantidade: ");
		cod = sc.nextInt();
		qtd = sc.nextInt();

		do {
			switch (cod) {
			case 1:
				preco = 4.00;
				produto = "CACHORRO-QUENTE";
				break;
			case 2:
				preco = 4.50;
				produto = "X-SALADA";
				break;
			case 3:
				preco = 5.00;
				produto = "X-BACON";
				break;
			case 4:
				preco = 2.00;
				produto = "TORRADA SIMPLES";
				break;
			case 5:
				preco = 1.50;
				produto = "REFRIGERANTE";
				break;
			default:
				preco = 0;
				produto = "INVÁLIDO";
			}
			total = preco * qtd;
			
			System.out.printf("TOTAL DE %s = %.2f%n%n", produto, total);
			System.out.println("Digite um novo código e quantidade para continuar ou 0 para parar: ");
			cod = sc.nextInt();
			qtd = sc.nextInt();
		}
		while(cod > 0 && cod < 6);
		
		sc.close();
		}
	}

