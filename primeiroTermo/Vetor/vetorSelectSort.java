package primeiroTermo.Vetor;

import java.util.Random;

public class vetorSelectSort {

	public static void main(String[] args) {

		int a[] = new int[10];
		int i, j, menor, pos;

		Random aleat = new Random();

		for (i = 0; i < 10; i++)
			a[i] = aleat.nextInt(99);
		
		System.out.print("Vetor Desordenado: ");
		for (i = 0; i < 10; i++)
			System.out.print(a[i] + " ");

		for (i = 0; i < 10; i++) 
		{
			menor = a[i];
			pos = i;
			for (j = i + 1; j < 10; j++)
				if (a[j] < menor) 
				{
					menor = a[j];
					pos = j;
				}
			a[pos] = a[i];
			a[i] = menor;
		}
		
		System.out.println("\n");
		System.out.print("Vetor Ordenado: ");
		for (i = 0; i < 10; i++)
			System.out.print(a[i] + " ");

	}

}