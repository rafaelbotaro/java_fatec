package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void ordena3numeros()
	{
		int a, b, c, x;
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		if (a>b)
		{
			x=a;
			a=b;
			b=x;
		}
		if (b>c)
		{
			x=b;
			b=c;
			c=x;
		}
		if (a>b)
		{
			x=a;
			a=b;
			b=x;
		}
		JOptionPane.showMessageDialog(null, "Números ordenados\n"+a+" - "+b+" - "+c);
		
	}
	
	public static void main(String[] args) {
		ordena3numeros();
		
	}

}
