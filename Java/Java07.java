import javax.swing.*;

class Java07

{
   public static void main (String entrada[])
   {
	
	int n1, n2, quo;
	double pow;
	String msg = "";

	n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
	n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro:"));

	quo = (int) n1 / (int) n2;
	pow = Math.pow(n1, n2);

	msg = msg + "quociente da divisao de " + n1 + " por " + n2 + " = " + quo + "\n";
	msg = msg + "potencia de " + n1 + " por " + n2 + " = " + pow + "\n";
	JOptionPane.showMessageDialog(null, msg);

	System.exit(0);
   }
}