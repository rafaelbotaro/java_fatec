package primeiroTermo.Matriz;

import java.util.Random;

public class matrizTransposta {

	public static void main(String[] args) {
		int m[][] = new int[4][6];
		int t[][] = new int[6][4];
		int i, j = 0;
		
		Random aleata = new Random();

		System.out.println("Matriz: \n");
		for (i = 0; i < 4; i++) 
		{
			for (j = 0; j < 6; j++) 
			{
				m[i][j] = aleata.nextInt(50) + 1;
				System.out.printf("[%02d] ", +m[i][j]);
			}
			
			System.out.println();
		}

		for (i = 0; i < 4; i++)
			for (j = 0; j < 6; j++)
				t[j][i] = m[i][j];
		
		System.out.println("\nMatriz transposta: \n");
		for (i = 0; i < 6; i++) 
		{
			for (j = 0; j < 4; j++) 
			{
				System.out.printf("[%02d] ", t[i][j]);
			}
			System.out.println();
		}

	}

}
