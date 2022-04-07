import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
			
		int numFunc, horasTrabalhadas;
		double valorHora, salario;
		
		System.out.print("Digite o número do funcionário: ");
		numFunc = sc.nextInt();
		System.out.print("Digite o número de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.print("Digite o valor da hora trabalhada: ");
		valorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = US$ %.2f", salario);
		
		sc.close();

	}

}
