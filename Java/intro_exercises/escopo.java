
public class Escopo {

	public static void main(String[] args) {
		
		double x = 0;
		double price = x;   // precisa iniciar a varíavel.
		
		System.out.println(price);
		
		double discount = 0; // declarar fora da estrutura e iniciar; 
		                     // pois se inciar dentro do IF, o if pode ser falso, e a 
						     // variável pode não inciar.
		if (price < 200) {   // outra alternativa é adicionar um else.
			discount = price * 0.2;
		}

		System.out.println(discount);
	}

}
