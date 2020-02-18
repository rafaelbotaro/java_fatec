package primeiroTermo.Matriz;

import java.util.Random;

public class matizMinMax {

	public static void main(String[] args) {

		int mat[][] = new int [10][10];
		int i, j;
		
		Random aleat = new Random();
		
		for (i = 0; i < 10; i++)
			for (j = 0; j < 10; j++)
				mat[i][j] = aleat.nextInt(98) + 1;

		System.out.println("Matriz \n");
		for (i = 0; i < 10; i++) 
		{
			for (j = 0; j < 10; j++)
				System.out.printf("[%02d] ", mat[i][j]);
			System.out.println();
		}
		
	}
}
