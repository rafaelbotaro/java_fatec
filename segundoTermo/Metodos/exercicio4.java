package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio4 {
	
	public static void maiorNum(int a, int b) {
		
		if (a > b)
			JOptionPane.showMessageDialog(null, "O maior n�mero �: "+a);
		else
			JOptionPane.showMessageDialog(null, "O maior n�mero �: "+b);	
		
	}
	
	public static void main (String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		
		maiorNum(a,b);		
		
	}

}