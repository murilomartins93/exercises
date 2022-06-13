package exercises;
import javax.swing.*;

class Java11
{
  public static void main (String entrada[])
  {
        
	int num1, num2, produto = 1;
        char op = '0';
        String msg = "", msgEntr = "Digite 1 para produto\nDigite 2 para produtoria\n";
         
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
	num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
	op = JOptionPane.showInputDialog(msgEntr).charAt(0);

	switch (op)
        {
		case '1':
                {
			if (num1 > 0 && num2 > 0) {
				produto = num1 * num2;
				msg = msg + "Produto de " + num1 + " por " + num2 + " = " + produto + "\n\n";
			}
			else {
				msg = "Um dos numeros nao eh par\n";
			}
		     
                	break;
		}
                case '2':
			for (int i = 1; i <= num2; i++){
				produto *= num1;
			}
			msg = msg + "Produtoria de " + num1 + ", por " + num2 + " vezes = " + produto + "\n\n";
			break;

                default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados");
	}
  
	if (op == '1' || op == '2')
        {
		JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
  }
}
