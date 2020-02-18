package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio4 {
	
	public static void maiorNum(int a, int b) {
		
		if (a > b)
			JOptionPane.showMessageDialog(null, "O maior número é: "+a);
		else
			JOptionPane.showMessageDialog(null, "O maior número é: "+b);	
		
	}
	
	public static void main (String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		maiorNum(a,b);		
		
	}

}