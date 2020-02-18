package segundoTermo.String;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		String nome, listaNomes="";
		nome = JOptionPane.showInputDialog("Informe um nome");
			
		for (int i=0;i<nome.length();i++)
			listaNomes+=nome+"\n";
			
		JOptionPane.showMessageDialog(null, listaNomes);

	}

}
