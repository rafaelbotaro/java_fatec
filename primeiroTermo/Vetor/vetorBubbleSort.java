package primeiroTermo.Vetor;

import java.util.Random;

public class vetorBubbleSort {

	public static void main(String[] args) {

		int a[] = new int[10];
		int i, j, aux;

		Random aleat = new Random();

		for (i = 0; i < 10; i++)
			a[i] = aleat.nextInt(99);

		System.out.print("Vetor Desordenado ->  ");
		for (i = 0; i < 10; i++)
			System.out.print(a[i] + " ");

		for (i = 0; i < 10; i++)
			for (j = 0; j < 10; j++)
				if (a[j] < a[i]) 
				{
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}

		System.out.println("\n");
		System.out.print("Vetor Ordenado ->  ");
		for (i = 0; i < 10; i++)
			System.out.print(a[i] + " ");
	}

}