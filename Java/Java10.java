import javax.swing.*;

class Java10
{
  public static void main (String entrada[])
  {
        
	int num1, num2, soma = 0;
        char op = '0';
        String msg = "", msgEntr = "Digite 1 para adicao\nDigite 2 para somatoria\n";
         
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
	num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
	op = JOptionPane.showInputDialog(msgEntr).charAt(0);

	switch (op)
        {
		case '1':
                {
			if (num1 % 2 == 0 && num2 % 2 == 0) {
				soma = num1 + num2;
				msg = msg + "Soma de " + num1 + " e " + num2 + " = " + soma + "\n\n";
			}
			else {
				msg = "Um dos numeros nao eh par\n";
			}
		     
                	break;
		}
                case '2':
			for (int i = 1; i <= num2; i++){
				soma += num1;
			}
			msg = msg + "Somatoria de " + num1 + ", por " + num2 + " vezes = " + soma + "\n\n";
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
