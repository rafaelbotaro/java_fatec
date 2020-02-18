package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class notasAlunosComFor {

	public static void main(String[] args) {

		int tam=0, i;
		float notas[] = new float [tam];
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o total de alunos da classe: ");
		tam = leia.nextInt();
		System.out.println();
		
		for ( i = 0; i < tam; i++)
		{
			System.out.print("Aluno "+(i+1)+ ", nota: ");
			notas[i] = leia.nextFloat();
		}
		
		System.out.println();
		System.out.println("Finalizado o lançamento das notas.");
		leia.close();
	}

}
