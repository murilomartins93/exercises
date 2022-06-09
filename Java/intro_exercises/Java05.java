class Java05 {

   public static void main (String entrada[]){
	
	int n1, n2;
	int mod, div;
	double sqrt, pow;
	String msg = "";
	double NumReal, sum; 
	char Character;
	
	n1 = Integer.parseInt(entrada[0]);
	n2 = Integer.parseInt(entrada[1]);
	
	mod = n1 % n2;
	div = (int) n1 / (int) n2;
	sqrt = Math.sqrt(n1);
	pow = Math.pow(n1, n2);

	msg = "n1 = " + n1 + " n2 = " + n2 + "\n";
	msg = msg + "resto da divisao de n1 por n2 = " + mod + "\n";
	msg = msg + "quociente da divisao de n1 por n2 = " + div + "\n";
	msg = msg + "raiz quadrada de n1 = " + sqrt + "\n";
	msg = msg + "potencia de n1 e n2 = " + pow + "\n";

	System.out.println(msg);
  	System.exit(0);

   }
}
