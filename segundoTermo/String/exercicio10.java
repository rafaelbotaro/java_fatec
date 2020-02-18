package segundoTermo.String;

import javax.swing.JOptionPane;

public class exercicio10 {

	public static void main(String[] args) {
		
		String palavra, palavraInvertida = " ";
		
		palavra = JOptionPane.showInputDialog("Digite uma palavra: ").toUpperCase();
		
		for (int i = palavra.length()-1; i >= 0; i--) //verifica se a palavra é lida igual de trás para frente
		{
			palavraInvertida+=palavra.charAt(i);
		}
		
		if (palavra.equals(palavraInvertida))
			JOptionPane.showMessageDialog(null, palavra+" é uma palíndrome.");
		else
			JOptionPane.showMessageDialog(null, palavra+" não é uma palíndrome.");
		
	}

}