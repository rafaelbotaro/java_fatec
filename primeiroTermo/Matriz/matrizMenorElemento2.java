package primeiroTermo.Matriz;

import java.util.Random;

public class matrizMenorElemento2 {
	
	public static void main(String[] args) {
		
		int a[][] = new int[10][10];
		int i, j, menor = 100;
		
		Random aleat = new Random();

		System.out.println("Matriz gerada");
		for (i = 0; i < 10; i++) 
		{
			for (j = 0; j < 10; j++) 
			{
				a[i][j] = aleat.nextInt(50) + 1;
				if (a[i][j] < menor)
					menor = a[i][j];
				System.out.printf(" [%02d] ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nO menor elemento é " + menor);

		for (i = 0; i < 10; i++) 
		{
			for (j = 0; j < 10; j++) 
			{
				if (a[i][j] == menor)
					System.out.println("Linha " + i + " Coluna " + j);
			}

		}
	}
}
