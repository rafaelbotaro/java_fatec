package primeiroTermo.Matriz;

import java.util.Random;

public class matrizDiagonalSecundaria2 {

	public static void main(String[] args) {

		int matriz[][] = new int [5][5];
		int i, j;
		
		Random gera = new Random();
		
		for (i=0; i<5; i++)
			for (j=0; j<5; j++)
				matriz[i][j] = gera.nextInt(50)+1;
		
		System.out.println("Matriz \n");
		for (i = 0; i < 5; i++) 
		{
			for (j = 0; j < 5; j++)
				System.out.printf(" [%02d] ", matriz[i][j]);
			System.out.println();
		}
		
		System.out.println("\nDiagonal Secundária\n");
		for (i=0; i<5; i++)
		{
			for(j=0; j<5; j++)
			{
				if(i+j == 4)
					System.out.printf(" [%02d] ", matriz[i][j]);
				else
					System.out.printf(" [  ] ", matriz [i][j]);
			}
			System.out.println();
		}
	}
}