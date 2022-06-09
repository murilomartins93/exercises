import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double valor1, valor2, valorTotal;
		
		System.out.println("Digite o código, quantidade e valor unitário da peça 01: ");
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		System.out.println("Digite o código, quantidade e valor unitário da peça 02: ");
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		valorTotal = (qtd1 * valor1) + (qtd2 * valor2);
		
		System.out.printf("VALOR A PAGAR DOS ITENS %d e %d = R$ %.2f", cod1, cod2, valorTotal);
		
		sc.close();
	}

}
