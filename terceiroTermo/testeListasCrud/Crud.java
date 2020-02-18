package terceiroTermo.testeListasCrud;

public class Crud {

	Aluno alunos[] = new Aluno[100];
	
	public void inserir(Aluno aluno) {
		for(int i = 0; i < alunos.length; i ++) {
			if (alunos[i] == null) {
				alunos[i] = aluno;
			}
		}
		
	}
	
	public String visualizar(Aluno a) {
		return null;
		
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}	
	
}
