package primeiroTermo.Matriz;

import java.util.Random;

public class matrizDuasSomarEmVetor {

		public static void main(String[] args) {

			int a[][] = new int [10][10];
			int soma[] = new int [10];
			int i, j;
			
			Random aleat = new Random();
			
			for (i = 0; i < 10; i++)
				for (j = 0; j < 10; j++)
					a[i][j] = aleat.nextInt(98)+1;
			
			for (i = 0; i < 10; i++)
			{
				soma[i] = 0;
				for (j = 0; j < 10; j++)
					soma[i] += a[i][j];
			}
			
			System.out.println("Matriz com vetor soma: \n");
			for (i = 0; i < 10; i++) 
			{
				for (j = 0; j < 10; j++)
					System.out.printf("[%02d] ", a[i][j]);
				System.out.printf(" =  [%3d] \n", soma[i]);
			}	
					
		}

	}
