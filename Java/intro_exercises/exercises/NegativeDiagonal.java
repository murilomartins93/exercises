package exercises;

import java.util.Scanner;

public class NegativeDiagonal {
	
    public static void main(String[] args) {
    
    	Scanner sc = new Scanner(System.in);
        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();
        
        int[][] mat = new int[n][n];
        int count = 0;
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        
        System.out.println("\nDIAGONAL PRINCIPAL:");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        
        System.out.println("\nQUANTIDADE DE NEGATIVOS = " + count);
        
        sc.close();
    }
}