package exercises;

import java.util.Scanner;

public class RowSum {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual a quantidade de linhas da matriz? ");
        int n = sc.nextInt();
        
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int m = sc.nextInt();
        
        double[][] mat = new double[n][m];
        double[] vect = new double[n];
        
        for (int i = 0; i < mat.length; i++) {
            System.out.printf("Digite os elementos da %da. linha:%n", i + 1);
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextDouble();
                vect[i] += mat[i][j];
            }
        }
        
        System.out.println("VETOR GERADO:");
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        
        sc.close();
    }
}