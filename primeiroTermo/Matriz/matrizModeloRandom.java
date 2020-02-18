package primeiroTermo.Matriz;

import java.util.Random;

public class matrizModeloRandom {

	public static void main(String[] args) {

		int a[][] = new int[10][10];
		int i, j;

		Random aleat = new Random();

		for (i = 0; i < 10; i++)
			for (j = 0; j < 10; j++)
				a[i][j] = aleat.nextInt(9);

		System.out.println("Matriz \n");
		for (i = 0; i < 10; i++) 
		{
			for (j = 0; j < 10; j++)
				System.out.printf(a[i][j] + " ");
			System.out.println();
		}
		
		System.out.println("\nMatriz \n");
		for (i = 0; i < 10; i++) 
		{
			for (j = 0; j < 10; j++)
				System.out.printf("[%03d]  ", a[i][j]);
			System.out.println("\n");
		}	

	}

}
