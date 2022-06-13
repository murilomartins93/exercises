package exercises;

public class CondicionalTernaria {

	public static void main(String[] args) {
		
		// IF ELSE
		double preco1 = 34.5;
		double desconto1;
		if (preco1 < 20.0) {
		desconto1 = preco1 * 0.1;
		}
		else {
		desconto1 = preco1 * 0.05;
		}
		
		// TERN�RIA
		double preco2 = 34.5;
		double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05;
		
		// TERN�RIA COM ELSE IF
		
		double preco3 = 34.5;
		double desconto3 = (preco3 < 20) ? preco3 * 0.10 
							: preco3 < 40 ? preco3 * 0.05 
							: preco3 * 0.025;
		
		System.out.println(desconto1);
		System.out.println(desconto2);
		System.out.println(desconto3);
	}

}
