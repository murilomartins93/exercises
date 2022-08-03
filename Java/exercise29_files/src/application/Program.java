package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		File path = new File("C:\\Temp\\srcFile.csv");
		File sourcePath = new File (path.getParent());
		boolean folderPathSuccess = new File(sourcePath + "\\out").mkdir();
		
		String targetFilePath = sourcePath + "\\out\\summary.csv";
			
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String itemLine = br.readLine();		
			while (itemLine != null) {
				
				String[] item = itemLine.split(",");
				String name = item[0];
				double price = Double.parseDouble(item[1]);
				int quantity = Integer.parseInt(item[2]);
				products.add(new Product(name, price, quantity));
				itemLine = br.readLine();
			}
			
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilePath))) {
			
			for(Product product : products) {
				bw.write(product.getName() + "," + String.format("%.2f", product.total()));
				bw.newLine();
			}
			
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
	
}