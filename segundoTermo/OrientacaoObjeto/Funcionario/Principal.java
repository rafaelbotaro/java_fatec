package segundoTermo.OrientacaoObjeto.Funcionario;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome, funcao, salario, novoSalario;
		
		nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
		funcao = JOptionPane.showInputDialog("Digite a função do funcionário");
		salario = JOptionPane.showInputDialog("Digite o salário do funcionario");
		
		Funcionario fun = new Funcionario(nome, funcao, salario);
		JOptionPane.showMessageDialog(null, fun.imprimir());
		
		novoSalario = JOptionPane.showInputDialog("Digite o novo salário: ");
		fun.alterarSalarioValor(novoSalario);
		JOptionPane.showMessageDialog(null, fun.imprimir());

	}

}