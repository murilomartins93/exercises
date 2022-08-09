package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import model.entities.Product;
import util.ProductPredicate;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.00));
		

		list.removeIf(new ProductPredicate());  // Predicate Interface
		
		list.removeIf(Product::staticProductPredicate); // Static Method Reference
		
		list.removeIf(Product::nonStaticProductPredicate); // Non Static Method Reference
		
		// Declared Lambda Function
		double min = 100.0;
		Predicate<Product> pred = p -> p.getPrice() >= min; 
		list.removeIf(pred); 
		
		list.removeIf(p -> p.getPrice() >= 100.0); // Lambda function in-line
		
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}
}
