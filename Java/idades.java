import java.util.Locale;
import java.util.Scanner;

public class idades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name1, name2;
		int age1, age2;
		double media;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		name1 = sc.nextLine();
		System.out.print("Idade: ");
		age1 = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		sc.nextLine();
		name2 = sc.nextLine();
		System.out.print("Idade: ");
		age2 = sc.nextInt();
		
		media = (double)(age1 + age2)/2.0;
				
		System.out.printf("A idade media de %s e %s e de %.1f anos.", name1, name2, media);
		
		sc.close();

	}
}
