package segundoTermo.String;

import javax.swing.JOptionPane;

public class exercicio3 {

	public static void main(String[] args) {

		int cont = 1;

		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		
		for (int i = 0; i < nome.length(); i++) //busca e imprime o nome tantas vezes quanto as letras do nome 
		{
			JOptionPane.showMessageDialog(null, cont+"a. Impressão: "+nome);
			cont++;
		}

	}

}