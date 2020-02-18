package segundoTermo.String;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		String frase;
		char letra;
		int cont = 0;
		frase = JOptionPane.showInputDialog("Informe uma frase").toUpperCase();
		letra = JOptionPane.showInputDialog("Informe um caractere").toUpperCase().charAt(0);

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra)
				cont++;
		}
		JOptionPane.showMessageDialog(null, frase + "\n\nTem " + cont + " caracteres (" + letra + ") na frase");

	}

}
