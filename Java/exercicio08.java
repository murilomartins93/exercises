import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		int x;
		
		System.out.print("Digite um n�mero: ");
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		sc.close();
	}

}
