
public class Escopo {

	public static void main(String[] args) {
		
		double x = 0;
		double price = x;   // precisa iniciar a var�avel.
		
		System.out.println(price);
		
		double discount = 0; // declarar fora da estrutura e iniciar; 
		                     // pois se inciar dentro do IF, o if pode ser falso, e a 
						     // vari�vel pode n�o inciar.
		if (price < 200) {   // outra alternativa � adicionar um else.
			discount = price * 0.2;
		}

		System.out.println(discount);
	}

}
