package primeiroTermo.Vetor;

import java.util.Scanner;

public class vetorOrdenado {

	public static void main(String[] args) {

		int i, j, aux;
		int a[] = new int[10];

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite os elementos do vetor: ");
		for (i = 0; i < 10; i++)
			a[i] = leia.nextInt();
		System.out.println();

		for (i = 0; i < 10; i++)
			for (j = i + 1; j < 10; j++)
				if (a[j] < a[i]) 
				{
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
		System.out.println("Vetor Ordenado: ");
		for (i = 0; i < 10; i++)
			System.out.print(" " + a[i]);
		leia.close();
	}
}