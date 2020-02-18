package terceiroTermo.listaContigua;

public class Vetor {
	
	No alunos[] = new No[100];
	int fim = 0;
	
	public void inserirFim(No a) {
		alunos[fim] = a;
		fim++;
	}
	
	public No consultar(No a) {
		return a;
	}

	public void imprimir() {
		for (int i = 0; i < fim; i++) {
			System.out.println("Nome: "+alunos[i].getNome());
			System.out.println("RA: "+alunos[i].getRa());
			System.out.println("Curso: "+alunos[i].getCurso());
		}
	}
	
	public void excluir(No a) {
		
	}
	
}
