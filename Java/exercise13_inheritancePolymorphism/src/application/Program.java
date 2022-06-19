package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		// Account acc = new Account(1001, "Alex", 1000.0); - Abstract classes can't be instanced;
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc; // Create Maria Account from subclass
		Account acc2 = new BusinessAccount(1003, "Bob", 1000.0, 200.0); // Subclass to Super
		Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 0.01); // Subclass to Super
		
		System.out.println(acc1.getHolder());
		
		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2; // Casting
		acc4.loan(100.0); // acc2 doesn't have the loan method without casting
		
		
		// BusinessAccount acc5 = (BusinessAccount)acc3 - Cast savings to business doesn't work!!! 
		if (acc3 instanceof BusinessAccount) {
		BusinessAccount acc5 = (BusinessAccount)acc3;
		acc5.loan(200.0);
		System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
		SavingsAccount acc5 = (SavingsAccount)acc3;
		acc5.updateBalance();
		System.out.println("Update!");
		}

		/* acc.withdraw(200.0);
		System.out.println(acc.getBalance()); */
		
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		acc4.withdraw(200.0);
		System.out.println(acc4.getBalance());
		
		// Polymorphism
		Account x = new BusinessAccount(1020, "Alex", 1000.0, 300.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01); // Upcast
		x.withdraw(50.0);
		y.withdraw(50.0);	
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}

}