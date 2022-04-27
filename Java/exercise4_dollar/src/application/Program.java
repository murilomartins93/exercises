package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dollar, real, amount;
			
		System.out.print("What is the dollar price? ");
		dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		amount = sc.nextDouble();

		real = CurrencyConverter.exchange(amount, dollar);
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", real));
		
		sc.close();
	}

}
