package util;

public class CurrencyConverter {
	
	public static double exchange(double amount, double dollar) {
		return (amount * dollar) * (1.0 + tax); 
	}
	
	public static final double tax = 0.06;
	
}
