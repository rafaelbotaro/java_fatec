package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exemplo1 {
	
	public static void dobro() {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		JOptionPane.showMessageDialog(null, "O dobro de "+a+" � "+(2*a));
		
	}

	public static void main(String[] args) {

		dobro();

	}

}