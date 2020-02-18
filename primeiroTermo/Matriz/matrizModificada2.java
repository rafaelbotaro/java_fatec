package primeiroTermo.Matriz;

import java.util.Random;

public class matrizModificada2 {

	public static void main(String[] args) {
		
		int a[][] = new int[10][10];
		int i, j, x;
		
		Random aleat = new Random();

		System.out.println("Matriz gerada \n");
		for (i = 0; i < 10; i++) 
		{
			for (j = 0; j < 10; j++) 
			{
				a[i][j] = aleat.nextInt(100);
				if (i == j || i + j == 9)
					System.out.printf("[%02d]", a[i][j]);
				else
					System.out.printf("    ", a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();

		for (i = 0; i < 10; i++) {
			x = a[i][i];
			a[i][i] = a[i][9 - i];
			a[i][9 - i] = x;
		}

		System.out.println("\nMatriz modificada\n");
		for (i = 0; i < 10; i++) 
		{
			for (j = 0; j < 10; j++) 
			{
				if (i == j || i + j == 9)
					System.out.printf("[%02d]", a[i][j]);
				else
					System.out.printf("    ", a[i][j]);
			}
			System.out.println();
		}

	}

}
