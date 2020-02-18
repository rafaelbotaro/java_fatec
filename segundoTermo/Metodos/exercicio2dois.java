package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio2dois {
	
	public static void divNum() {
		
		float div;
		
		float a = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
		float b = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
		
		div = a / b;
		
		JOptionPane.showMessageDialog(null, "Resultado da divisão: "+div);
		
	}
	
	public static void main (String[] args) {

		divNum();
		
	}
	
}