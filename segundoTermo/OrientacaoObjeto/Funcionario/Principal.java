package segundoTermo.OrientacaoObjeto.Funcionario;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome, funcao, salario, novoSalario;
		
		nome = JOptionPane.showInputDialog("Digite o nome do funcion�rio");
		funcao = JOptionPane.showInputDialog("Digite a fun��o do funcion�rio");
		salario = JOptionPane.showInputDialog("Digite o sal�rio do funcionario");
		
		Funcionario fun = new Funcionario(nome, funcao, salario);
		JOptionPane.showMessageDialog(null, fun.imprimir());
		
		novoSalario = JOptionPane.showInputDialog("Digite o novo sal�rio: ");
		fun.alterarSalarioValor(novoSalario);
		JOptionPane.showMessageDialog(null, fun.imprimir());

	}

}