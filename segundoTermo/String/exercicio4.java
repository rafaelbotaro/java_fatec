package segundoTermo.String;

import javax.swing.JOptionPane;

public class exercicio4 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite um nome: ").toUpperCase();
		
		for (int i = 0; i < nome.length(); i+=2) //busca e imprime as letras pares do nome
		{
			JOptionPane.showMessageDialog(null, "Letras pares do nome: "+nome.charAt(i));
		}

	}

}