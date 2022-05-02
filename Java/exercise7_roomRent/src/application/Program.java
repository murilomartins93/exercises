package application;

import entities.Renter;
import java.util.Scanner;

public class Program {
	
	private static final int INN_ROOMS = 10;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Renter[] rooms = new Renter[INN_ROOMS];
		
		System.out.print("How many rooms will be rented: ");
		int n = sc.nextInt();
		System.out.println();
						
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d:%n", (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rooms[room] = new Renter(name, email);	
			System.out.println();
		}
		
		System.out.println("Busy Rooms:");
		for (int i = 0; i < INN_ROOMS; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i].toString());			
			}			
		}
		
		System.out.println();
		System.out.print("Empty Rooms: ");
		for (int i = 0; i < INN_ROOMS; i++) {
			if (rooms[i] == null) {
				System.out.print(i + " ");			
			}			
		}
		
		sc.close();
	}

}
