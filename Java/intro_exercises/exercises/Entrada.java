package exercises;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;
		char y;
		
		x = sc.nextInt();
		y = sc.next().charAt(0);  // Quero só a letra na posição zero
		sc.nextLine();          // precisa limpar o buffer pq o NextInt gera uma quebra  
		s1 = sc.nextLine();     // que precisa ser consumida
		s2 = sc.nextLine();
		s3 = sc.nextLine();
					
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);	
		System.out.println(s1);
		System.out.println(s2);  
		System.out.println(s3);
		System.out.println(y);
		System.out.println("A letra na posição 2 é " + s3.charAt(1) + "."); 
		System.out.printf("A letra na posição 3 é %s.", s3.charAt(2)); // Duas formas de
		sc.close();                                                    // imprimir 
	}
}
