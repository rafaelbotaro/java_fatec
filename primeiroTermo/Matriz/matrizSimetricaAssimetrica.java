package primeiroTermo.Matriz;

import java.util.Random;

public class matrizSimetricaAssimetrica {

	public static void main(String[] args) {

		int m[][] = new int[5][5];
		int i, j = 0;
		boolean sim = true;

		Random aleat = new Random();

		System.out.println("Matriz: \n");
		for (i = 0; i < 5; i++) 
		{
			for (j = 0; j < 5; j++) 
			{
				m[i][j] = aleat.nextInt(50) + 1;
				System.out.printf("[%02d] ", +m[i][j]);
			}
			System.out.println();
		}

		for (i = 1; i < 5; i++)
			for (j = 1; j < 5; j++)
				if (m[i][j] != m[j][i]) 
				{
					sim = false;
					break;
				}
		
		if (sim)
			System.out.println("\nEssa Matriz é SIMÉTRICA!");
		else
			System.out.println("\nEssa Matriz é ASSIMÉTIRCA!");

	}

}
