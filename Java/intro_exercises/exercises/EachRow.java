package exercises;

import java.util.Scanner;

public class EachRow {
	
    public static void main(String[] args) {
   
    	Scanner sc = new Scanner(System.in);
    	
        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();
    
        int[][] mat = new int[n][n];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
        for (int i = 0; i < mat.length; i++) {
            int biggest = mat[i][0];
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] > biggest) {
                    biggest = mat[i][j];
                }
            }
            System.out.println(biggest);
        }
        
        sc.close();
    }
}