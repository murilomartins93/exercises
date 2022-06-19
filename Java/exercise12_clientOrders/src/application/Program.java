package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Product;
import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		System.out.println();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String orderStatus = sc.nextLine();
		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), new Client(name, email, birthDate));
		
		System.out.println();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		System.out.println();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Enter #%d item data:%n", i);
			System.out.print("Product name: ");	
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt(); 
			order.addItem(new OrderItem(productQuantity, new Product(productName, productPrice)));
		}
		
		System.out.printf("%nORDER SUMMARY:%n");
        System.out.println(order);
        
		sc.close();
	}
}