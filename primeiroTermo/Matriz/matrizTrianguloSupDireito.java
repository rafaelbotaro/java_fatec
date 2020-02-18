package primeiroTermo.Matriz;

import java.util.Random;

public class matrizTrianguloSupDireito {

	public static void main(String[] args) {

		int matriz[][] = new int[5][5];
		int i, j;

		Random gera = new Random();

		for (i = 0; i < 5; i++)
			for (j = 0; j < 5; j++)
				matriz[i][j] = gera.nextInt(50) + 1;

		System.out.println("\nTriângulo Superior Direito");
		for (i = 0; i < 5; i++) 
		{
			for (j = 0; j < 5; j++) 
			{
				if (j > i)
					System.out.printf(" [%2d] ", matriz[i][j]);
				else
					System.out.printf(" [  ] ", matriz[i][j]);
			}
			System.out.println();
		}

	}

}