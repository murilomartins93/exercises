package exercises;

import java.util.Scanner;

public class NegativeMatrix {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual a quantidade de linhas da matriz? ");
        int n = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int m = sc.nextInt();
        
        int[][] mat = new int[n][m];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("VALORES NEGATIVOS:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    System.out.println(mat[i][j]);
                }
            }
        }
        
        sc.close();
    }
}