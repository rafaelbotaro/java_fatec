package segundoTermo.String;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		String nome;
		nome = JOptionPane.showInputDialog("Informe um nome");
		JOptionPane.showMessageDialog
				(null, nome+" tem "+nome.length()+" caracteres");

	}

}
