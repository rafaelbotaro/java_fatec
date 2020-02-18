package primeiroTermo.Vetor;

import java.util.Scanner;

public class vetorInterseccao {

	public static void main(String[] args) {

		int i, j, k;
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite os valores do vetor A: ");
		for (i = 0; i < 10; i++)
			a[i] = leia.nextInt();
		System.out.println();

		System.out.println("Digite os valores do vetor B: ");
		for (i = 0; i < 10; i++)
			b[i] = leia.nextInt();
		System.out.println();

		for (i = 0, k = 0; i < 10; i++)
			for (j = 0; j < 10; j++)
				if (a[i] == b[j])
					c[k++] = a[i];

		if (k == 0)
			System.out.println("Intersecção vazia!");
		else 
		{
			System.out.println("Vetor Intersecção: ");
			for (i = 0; i < 10; i++)
				System.out.print(" " + c[i]);
		}
		leia.close();
	}

}