package segundoTermo.OrientacaoObjeto.Funcionario;

public class Funcionario {
	
public String nome, funcao, salario;
	
	public Funcionario(String n, String f, String s) {
		
		nome = n;
		funcao = f;
		salario = s;
		
	}
	
	public void alterarSalarioValor(String novoSalario) {
		
		salario = novoSalario;
			
	}

	
	public String imprimir() {
		
		return "Nome: "+nome+ "\nFunção: "+funcao+"\nSalário: "+salario;
			
	}

}