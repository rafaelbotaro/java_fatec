package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio5 {

public static int maiorNum(int a, int b) {
		
		if (a > b)
			return a;
		return b;
		
	}
	
	public static void main (String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		int maior = maiorNum(a,b);
				
		JOptionPane.showMessageDialog(null, "O maior número é: "+maior);		
		
	}
	
}