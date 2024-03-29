package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double imposto;
		
		System.out.print("Digite o valor do sal�rio: ");
		salario = sc.nextDouble();
		
		if(salario <= 2000) {
			imposto = 0;
		} else if(salario >= 2000.01 && salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
		} else if(salario >= 3000.01 && salario <= 4500) {
			imposto = (salario - 3000) * 0.18 + 80; 
		} else {
			imposto = (salario - 4500) * 0.28 + 350;
		}

		if(imposto == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("IMPOSTO A PAGAR = R$ %.2f", imposto);
		}
				
		sc.close();
	}
}
