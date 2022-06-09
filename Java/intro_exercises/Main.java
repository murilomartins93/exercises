import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ola mundo!"); 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Saída de Dados  
		
		int idade;
		double salario, altura;
		char genero;
		String nome; 
		
		idade = 30; 
		salario = 5800.5; 
		altura = 1.72; 
		genero = 'F'; 
		nome = "Maria Silva"; 
		
		System.out.println("IDADE = " + idade); 
		System.out.println("SALARIO = " + String.format("%.2f", salario)); 
		System.out.println("ALTURA = " + String.format("%.2f", altura)); 
		System.out.println("GENERO = " + genero); 
		System.out.println("NOME = " + nome); 
		
		System.out.print("Bom dia"); 
		System.out.print("Boa noite");
		
		System.out.println("Bom dia"); 
		System.out.println("Boa noite");
		
		int x, y;
		x = 10; 
		y = 20; 
		System.out.println(x); 
		System.out.println(y); 
		
		double z;
		z = 2.3456; 
		System.out.println(String.format("%.2f", z)); 
		
		int idade1;
		double salario1; 
		String nome1; 
		char sexo; 
		idade1 = 32; 
		salario1 = 4560.9; 
		nome1 = "Maria Silva"; 
		sexo = 'F'; 
		System.out.println("A funcionaria " + nome1 + ", sexo " + sexo + ", ganha " 
		+ String.format("%.2f", salario1) + " e tem " + idade1 + " anos"); 
		
		int a, b;
		a = 5; 
		b = 2 * a; 
		System.out.println(a); 
		System.out.println(b);
		
		int c;
		double d; 
		c = 5; 
		d = 2 * c; 
		System.out.println(c); 
		System.out.println(String.format("%.1f", d)); 

		double b1, b2, h, area;
		b1 = 6.0; 
		b2 = 8.0; 
		h = 5.0; 
		area = (b1 + b2) / 2.0 * h; 
		System.out.println(area); 
		
		int e, f;
		double resultado;
		e = 5; 
		f = 2; 
		resultado = (double)e / f; 
		System.out.println(String.format("%.2f", resultado));
		
		double o;
		int p; 
		o = 5.0; 
		p = (int)o; 
		System.out.println(p); 
		
		
		// Entrada de Dados 
		
		String name1, name2;
		double salary1, salary2;
		int age;
		char sex;
		
		System.out.print("Digite o nome da primeira pessoa: ");
		name1 = sc.nextLine();
		System.out.print("Digite o salario da primeira pessoa: ");
		salary1 = sc.nextDouble();
		System.out.print("Digite o nome da segunda pessoa: ");
		sc.nextLine();
		name2 = sc.nextLine();
		System.out.print("Digite o salario da segunda pessoa: ");
		salary2 = sc.nextDouble();
		System.out.print("Digite uma idade: ");
		age = sc.nextInt();
		System.out.print("Digite um sexo (F/M): "); 
		sex = sc.next().charAt(0); 
		
		System.out.println("Nome 1: " + name1); 
		System.out.println("Salario 1: " + String.format("%.2f", salary1)); 
		System.out.println("Nome 2: " + name2); 
		System.out.println("Salario 2: " + String.format("%.2f", salary2)); 
		System.out.println("Idade: " + age); 
		System.out.println("Sexo: " + sex); 
		 
		sc.close();
		
	}

}
