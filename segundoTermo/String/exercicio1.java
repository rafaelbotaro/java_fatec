package segundoTermo.String;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Informe um nome").toUpperCase();
			JOptionPane.showMessageDialog(null, nome+" tem "+nome.length()+" caracteres"); //verifica numero de caracteres do nome

	}

}