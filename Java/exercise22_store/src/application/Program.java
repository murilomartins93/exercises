package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Program {
	
    public static void main(String[] args) {
   
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Product> list = new ArrayList<Product>();
        
        System.out.print("Serao digitados dados de quantos produtos? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Produto %d:%n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preço de compra: ");
            double purchasePrice = sc.nextDouble();
            System.out.print("Preço de venda: ");
            double salePrice = sc.nextDouble();
            list.add(new Product(name, purchasePrice, salePrice));
        }
       
        double purchaseTotal = 0.0;
        double saleTotal = 0.0;
        int below = 0;
        int between = 0;
        int above = 0;
        
        for (Product p : list) {
            if (p.profit() < 10.0) {
                below++;
            }
            else if (p.profit() < 20.0) {
                between++;
            }
            else {
                above++;
            }
            purchaseTotal += p.getPurchasePrice();
            saleTotal += p.getSalePrice();
        }
        
        double profitTotal = saleTotal - purchaseTotal;
        System.out.println(report(below, between, above, purchaseTotal, saleTotal, profitTotal));
        
        sc.close();
    }
    
    public static String report(int below, int between, int above, double purchaseTotal, 
    		double saleTotal, double profitTotal) {
        return "\nRELATORIO: \nLucro abaixo de 10%: " + below 
        		+ "\nLucro entre 10% e 20%: " + between 
        		+ "\nLucro acima de 20%: " + above 
        		+ "\nValor total de compra: " + String.format("%.2f", purchaseTotal) 
        		+ "\nValor total de venda: " + String.format("%.2f", saleTotal) 
        		+ "\nLucro total: " + String.format("%.2f", profitTotal);
    }
}