package segundoTermo.String;

import javax.swing.JOptionPane;

public class exercicio7 {

	public static void main(String[] args) {

		String palavra, palavraInvertida="";
		
		palavra = JOptionPane.showInputDialog("Digite uma palavra:").toUpperCase();
		
		for (int i = palavra.length()-1; i >= 0; i--) //busca e imprime a palavra digitada só que invertida
		{
			palavraInvertida+=palavra.charAt(i)+"\n";
			JOptionPane.showMessageDialog(null, palavraInvertida);
		}
	}

}
