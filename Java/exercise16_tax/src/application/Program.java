package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Renda anual com salário: ");
		double income = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		double service = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		double capital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		double medical = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		double educational = sc.nextDouble();
		report(income, service, capital, medical, educational);	
		
		sc.close();
	}
	
	private static double incomeTax(double value) {
		
		double monthSalary = value / 12;
		
		if (monthSalary < 3000) {
			return 0.0;
		} else if (monthSalary < 5000){
			return value * 0.1;
		} else {
			return value * 0.2;
		}	
	}
	
	private static double serviceTax(double value) {
		
		if (value != 0.0) {
			return value * 0.15;
		} else {
			return 0.0;
		}	
	}
	
	private static double capitalTax(double value) {
		
		if (value != 0.0) {
			return value * 0.20;
		} else {
			return 0.0;
		}	
	}
		
	private static double deductible(double totalTax, double deductExp, double maxDeduct) {
		
		if (deductExp > totalTax * 0.3) {
			return maxDeduct;
		} else {
			return deductExp;
		}
	}
	
	private static void report(double income, double service, double capital, double medical, double educational) {
		
		double totalTax = incomeTax(income) + serviceTax(service) + capitalTax(capital);
		double deductExp = medical + educational;
		double maxDeduct = totalTax * 0.3;
		double deduct = deductible(totalTax, deductExp, maxDeduct);
		double dueTax = totalTax - deduct;
		
		System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA\n");
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f%n", incomeTax(income)); 
		System.out.printf("Imposto sobre serviços: %.2f%n", serviceTax(service));
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", capitalTax(capital));
		System.out.println("\nDEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maxDeduct); 
		System.out.printf("Gastos dedutíveis: %.2f%n", deductExp);
		System.out.println("\nRESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", totalTax); 
		System.out.printf("Abatimento: %.2f%n", deduct);
		System.out.printf("Imposto devido: %.2f%n", dueTax);
	}
	
}