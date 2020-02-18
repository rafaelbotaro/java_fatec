package segundoTermo.String;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		String nome, listaLetras="";
		nome = JOptionPane.showInputDialog("Informe um nome");
			
		for (int i=0;i<nome.length();i+=2)
			listaLetras+=nome.charAt(i);
			
		JOptionPane.showMessageDialog(null, listaLetras);

	}

}
