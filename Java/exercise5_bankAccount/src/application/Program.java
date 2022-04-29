package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
					
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
				
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		if(answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initial = sc.nextDouble();	
			acc = new Account(number, holder, initial);	
		} else {
			acc = new Account(number, holder);	
		}
		
				
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		
		System.out.println("Updated account data:");
		System.out.println(acc);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		
		System.out.println("Updated account data:");
		System.out.println(acc);
		
		sc.close();
	}

}

