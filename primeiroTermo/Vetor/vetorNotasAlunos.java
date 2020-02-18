package primeiroTermo.Vetor;

import java.util.Scanner;

public class vetorNotasAlunos {

	public static void main(String[] args) {

		float a[] = new float[20];
		float b[] = new float[20];
		float c[] = new float[20];
		int i, j, k;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite as notas dos 20 alunos: \n");
		for (i = 0; i < 20; i++)
			a[i] = leia.nextFloat();
		System.out.println();
		
		for (i = 0, j = 0, k = 0; i < 20; i++)
			if (a[i] >= 7)
				b[j++] = a[i];
			else
				c[k++] = a[i];
		
		System.out.print("\nVetor dos aprovados: \n");
		for (i = 0; i < j; i++)
			System.out.print(b[i] +"  ");
		System.out.println();
		
		System.out.print("\nVetor dos reprovados: \n");
		for (i = 0; i < k; i++)
			System.out.print(c[i] +"  ");
		System.out.println();
		
		leia.close();
		
	}
}