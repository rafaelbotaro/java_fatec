package segundoTermo.String;

import javax.swing.JOptionPane;

public class Exercicio05V02 {

	public static void main(String[] args) {
		String frase, vogais = "AEIOU";
		int contVogais = 0;
		frase = JOptionPane.showInputDialog("Informe uma frase").toUpperCase();

		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < vogais.length(); j++) {
				if (frase.charAt(i) == vogais.charAt(j))
					contVogais++;
			}
		}

		JOptionPane.showMessageDialog(null, frase + "\n\nTem " + contVogais + " vogais na frase");

	}

}
