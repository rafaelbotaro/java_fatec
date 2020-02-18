package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exemplo1 {
	
	public static void dobro() {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		JOptionPane.showMessageDialog(null, "O dobro de "+a+" é "+(2*a));
		
	}

	public static void main(String[] args) {

		dobro();

	}

}