import javax.swing.*;

class Java14 
{
   public static void soma(int vet[])
   { 
	int s = 0;
	
	for (int i = 0; i < vet.length; i++)
	{
		s += vet[i];
	}
	
	JOptionPane.showMessageDialog(null, "A somatoria eh " + s);
   }

   public static int produto(int vet[])
   {
	int p = 1;

	for (int i = 0; i < vet.length; i++)
	{
		p *= vet[i];
	}
	
	return p;
   }
   
   public static void main (String[] entrada)
   {
	int r, vet[] = {1, 2, 3, 4, 5};

	soma(vet);
	r = produto(vet);
	JOptionPane.showMessageDialog(null, "A produtoria eh " + r);
	
	System.exit(0);
   }
}