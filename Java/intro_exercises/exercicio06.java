import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTri, areaCirc, areaTrap, areaQuad, areaRet;
		
		System.out.println("Digite as medidas A, B e C:");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTri = (A * C) / 2;
		areaCirc = Math.PI * Math.pow(C, 2);
		areaTrap = ((A + B) * C) / 2;
		areaQuad = B * B;
		areaRet = A * B;
		
		System.out.printf("TRIÂNGULO = %.3f%n", areaTri);
		System.out.printf("CÍRCULO = %.3f%n", areaCirc);
		System.out.printf("TRAPÉZIO = %.3f%n", areaTrap);
		System.out.printf("QUADRADO = %.3f%n", areaQuad);
		System.out.printf("RETÂNGULO = %.3f%n", areaRet);
		
		sc.close();
	}

}
