package segundoTermo.OrientacaoObjeto.Pessoa;

import javax.swing.JOptionPane;

public class Pessoa {

	public String nome, cpf, email;
	
	public void construtor() {
		
		nome = JOptionPane.showInputDialog("Digite seu nome");
		cpf = JOptionPane.showInputDialog("Digite seu CPF");
		email = JOptionPane.showInputDialog("Digite seu email").toLowerCase();
		
	}
	
	public void imprimir() {
		
		JOptionPane.showMessageDialog(null, "Seu nome é: "+nome);
		JOptionPane.showMessageDialog(null, "Seu CPF é: "+cpf);
		JOptionPane.showMessageDialog(null, "Seu email é: "+email);
		
	}
	
}