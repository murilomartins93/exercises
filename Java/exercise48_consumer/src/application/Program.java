package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import model.entities.Product;
import util.PriceUpdate;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.00));
		
		// Interface implementation
		list.forEach(new PriceUpdate());
		
		// Static Method Reference
		list.forEach(Product::staticPriceUpdate);
		
		// Non Static Method Reference
		list.forEach(Product::nonStaticPriceUpdate); 
		
		// Declared Lambda Function
		double factor = 1.1; // can be inserted by the user;
		Consumer<Product> cons = p -> {        
			p.setPrice(p.getPrice() * factor);
		};
		list.forEach(cons);
		
		// Lambda function in-line
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
				
		// Print method with for each
		list.forEach(System.out::println); 
						
	}
}
