package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio1dois {
	
	public static void parImpar() {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		
		if (a % 2 == 0)
			JOptionPane.showMessageDialog(null, "O n�mero � PAR.");
		else
			JOptionPane.showMessageDialog(null, "O n�mero � IMPAR.");
	}

	public static void main(String[] args) {

		parImpar();
		
	}
	
}