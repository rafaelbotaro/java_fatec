package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio2dois {
	
	public static void divNum() {
		
		float div;
		
		float a = Float.parseFloat(JOptionPane.showInputDialog("Digite um n�mero: "));
		float b = Float.parseFloat(JOptionPane.showInputDialog("Digite um n�mero: "));
		
		div = a / b;
		
		JOptionPane.showMessageDialog(null, "Resultado da divis�o: "+div);
		
	}
	
	public static void main (String[] args) {

		divNum();
		
	}
	
}