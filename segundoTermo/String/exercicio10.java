package segundoTermo.String;

import javax.swing.JOptionPane;

public class exercicio10 {

	public static void main(String[] args) {
		
		String palavra, palavraInvertida = " ";
		
		palavra = JOptionPane.showInputDialog("Digite uma palavra: ").toUpperCase();
		
		for (int i = palavra.length()-1; i >= 0; i--) //verifica se a palavra � lida igual de tr�s para frente
		{
			palavraInvertida+=palavra.charAt(i);
		}
		
		if (palavra.equals(palavraInvertida))
			JOptionPane.showMessageDialog(null, palavra+" � uma pal�ndrome.");
		else
			JOptionPane.showMessageDialog(null, palavra+" n�o � uma pal�ndrome.");
		
	}

}