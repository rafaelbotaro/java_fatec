package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio3 {
	
	public static void ordenar() {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3� n�mero: "));
		
		int x;
		
		if (a > b)
		{
			x = a;
			a = b;
			b = x;
		}
		if (b > c)
		{
			x = b;
			b = c;
			c = a;
		}
		if (a > b)
		{
			x = a;
			a = b;
			b = x;
		}
		
		JOptionPane.showMessageDialog(null, "Os n�meros em ordem crescente: "+a+" "+b+" "+c);
		
	}

	public static void main(String[] args) {
		
		ordenar();

	}

}