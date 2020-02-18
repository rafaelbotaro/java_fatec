package segundoTermo.String;

import javax.swing.JOptionPane;

public class exercicio2 {

	public static void main(String[] args) {
		
		int cont = 1;

		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		
		for (int i = 0; i < 10; i++) //busca e imprime o nome 10 vezes
		{
			JOptionPane.showMessageDialog(null, cont+"a. Impressão: "+nome);
			cont++;
		}

	}

}