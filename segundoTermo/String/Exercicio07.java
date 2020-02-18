package segundoTermo.String;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		String frase, fraseInv = "";
		frase = JOptionPane.showInputDialog("Informe uma frase").toUpperCase();

		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseInv += frase.charAt(i);
		}
		JOptionPane.showMessageDialog(null, frase + "\n\n" + fraseInv);

	}

}
