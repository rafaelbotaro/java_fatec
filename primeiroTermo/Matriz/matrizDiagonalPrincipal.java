package primeiroTermo.Matriz;

import java.util.Random;

public class matrizDiagonalPrincipal {

	public static void main(String[] args) {

		int a[][] = new int[5][5];
		int i, j;

		Random aleat = new Random();

		for (i = 0; i < 5; i++)
			for (j = 0; j < 5; j++)
				a[i][j] = aleat.nextInt(99);

		System.out.println("Matriz \n");
		for (i = 0; i < 5; i++) 
		{
			for (j = 0; j < 5; j++)
				System.out.printf(" [%2d] ", a[i][j]);
			System.out.println();
		}

		System.out.println("\n");
		System.out.println("Diagonal Principal: \n");
		for (i = 0; i < 5; i++)
			for (j = 0; j < 5; j++)
				if (i == j)
					System.out.printf(" [%2d] ", a[i][j]);

	}

}