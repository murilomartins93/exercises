package exercises;

import java.util.Scanner;

public class AboveDiagonal {
	
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        System.out.print("Qual a ordem da matriz? ");
        
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i < j) {
                    sum += mat[i][j];
                }
            }
        }
        
        System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + sum);
        
        sc.close();
    }
}