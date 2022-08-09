package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.entities.Product;
import util.UpperCaseName;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.00));
		
		/* The original list is a product list
		 * The desired effect is to generate a new list with product names in upperCase
		 * To do so, first, the Product list is converted to a stream, that is mapped with the .map() method 
		 * to apply a function, in this case, the UpperCaseName() function.
		 * After, the stream needs to be transformed back to a list, with the method .collect, calling the class 
		 * Collectors and method .toList().
		 * This will convert the stream back to a list, that needs to be saved in a new list, 
		 * hence the List<String> names.
		 * 
		 * P.S.: this method .map() only works for streams. Don't confuse the .map() method with the interface Map<K, T>:
		 */
		
		// Interface implementation
		List<String> names1 = list.stream().map(new UpperCaseName()).collect(Collectors.toList());  
	
		// Static Method Reference
		List<String> names2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());  
		
		// Non Static Method Reference
		List<String> names3 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()); 
		
		// Declared Lambda Function
		Function<Product, String> func = p -> p.getName().toUpperCase();
		List<String> names4 = list.stream().map(func).collect(Collectors.toList()); 
		
		// Lambda function in-line
		List<String> names5 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names1.forEach(System.out::println); // Print method with for each
		names2.forEach(System.out::println); // Print method with for each
		names3.forEach(System.out::println); // Print method with for each
		names4.forEach(System.out::println); // Print method with for each
		names5.forEach(System.out::println); // Print method with for each
						
	}
}
