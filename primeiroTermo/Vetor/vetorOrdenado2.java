package primeiroTermo.Vetor;

import java.util.Scanner;

public class vetorOrdenado2 {

	public static void main(String[] args) {

		int i, j, menor, pos;
		int a[] = new int[10];

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite os elementos do vetor: ");
		for (i = 0; i < 10; i++)
			a[i] = leia.nextInt();
		System.out.println();

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

		System.out.println("Vetor Ordenado: ");
		for (i = 0; i < 10; i++)
			System.out.print(" " + a[i]);
		leia.close();
		
	}
	
}