package segundoTermo.String;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		String frase;
		int contVogais = 0;
		frase = JOptionPane.showInputDialog("Informe uma frase").toUpperCase();

		for (int i = 0; i < frase.length(); i++) 
		{
			switch (frase.charAt(i)) 
			{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				contVogais++;
				break;
			}
		}
		JOptionPane.showMessageDialog(null, frase + "\n\nTem " + contVogais + " vogais na frase");
	}

}
