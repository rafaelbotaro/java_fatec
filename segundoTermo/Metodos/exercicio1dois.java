package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio1dois {
	
	public static void parImpar() {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		if (a % 2 == 0)
			JOptionPane.showMessageDialog(null, "O número é PAR.");
		else
			JOptionPane.showMessageDialog(null, "O número é IMPAR.");
	}

	public static void main(String[] args) {

		parImpar();
		
	}
	
}