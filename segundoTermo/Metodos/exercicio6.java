package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio6 {
	
	public static int potencia(int base, int expoente) {
		
		int pot = 1;
		for (int i = 1; i <= expoente; i++)
		{
			pot *= base;
		}
		return pot;
	}
	
	public static void main (String[] args) {
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base: "));
		int expoente = Integer.parseInt(JOptionPane.showInputDialog("Informe o expoente: "));
		
		int p = potencia(base, expoente);
		
		JOptionPane.showMessageDialog(null, base+" elevado a "+expoente+ " = "+p);
		
	}

}