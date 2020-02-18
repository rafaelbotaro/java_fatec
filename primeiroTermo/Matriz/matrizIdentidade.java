package primeiroTermo.Matriz;

import java.util.Random;

public class matrizIdentidade {

	public static void main(String[] args) {
		
		int m[][] = new int[5][5];
		int i, j = 0;
		boolean id = true;
		
		Random aleat = new Random();

		System.out.println("Matriz: \n");
		for (i = 0; i < 5; i++) 
		{
			for (j = 0; j < 5; j++) 
			{
				m[i][j] = aleat.nextInt(2);
				System.out.printf("[%d] ", +m[i][j]);
			}
			
			System.out.println();
			
		}

		for (i = 0; i < 5; i++)
			for (j = 0; j < 5; j++)
				if (((i == j) && (m[i][j] != 1)) || ((i != j) && (m[i][j] != 0))) 
				{
					id = false;
					break;
				}
		
		if (id)
			System.out.println("\nMatriz é identidade! ");
		else
			System.out.println("\nMatriz não é identidade! ");
		
	}

}
