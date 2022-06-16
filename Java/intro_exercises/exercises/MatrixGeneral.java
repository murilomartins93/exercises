package exercises;

import java.util.Locale;
import java.util.Scanner;

public class MatrixGeneral {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Qual a ordem da matriz? ");
	    int n = sc.nextInt();

	    double[][] mat = new double[n][n];

	    for(int i = 0; i < mat.length; i++) {
	        for(int j = 0; j < mat[i].length; j++) {
	            System.out.printf("Elemento [%d,%d]: ", i, j);
	            mat[i][j] = sc.nextDouble();
	        }
	    }

	    double sum = 0.0;
	    
	    for(int i = 0; i < mat.length; i++) {
	        for(int j = 0; j < mat[i].length; j++) {
	            if(mat[i][j] > 0) {
	            sum += mat[i][j];
	            }
	        }
	    }
	    System.out.printf("%nSOMA DOS POSITIVOS: %.1f%n", sum);

	    System.out.printf("%nEscolha uma linha: ");
	    int row = sc.nextInt();
	    System.out.printf("LINHA ESCOLHIDA: ");
	    for (int j = 0; j < n; j++) {
	    	System.out.printf("%.1f ", mat[row][j]);
	    }

	    System.out.printf("%n%nEscolha uma coluna: ");
	    int column = sc.nextInt();
	    System.out.printf("COLUNA ESCOLHIDA: ");
	    for (int i = 0; i < n; i++) {
	    	System.out.printf("%.1f ", mat[i][column]);
	    }
	    
	    System.out.printf("%n%nDIAGONAL PRINCIAL: ");
	    for (int i = 0; i < n; i++) {
	    	System.out.printf("%.1f ", mat[i][i]);
	    }

	    System.out.printf("%n%nMATRIZ ALTERADA:%n");
	    for (int i = 0; i < n; i++) {
	    	for (int j = 0; j < n; j++) {
	            if(mat[i][j] < 0) {
	            	mat[i][j] *= mat[i][j];
	            }
	            System.out.printf("%.1f ", mat[i][j]);
	        }
	        System.out.printf("%n");
	    }
	    
	    sc.close();
	}

}