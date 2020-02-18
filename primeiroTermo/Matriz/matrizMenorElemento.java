package primeiroTermo.Matriz;

import java.util.Random;

public class matrizMenorElemento {

	public static void main(String[] args) {
		
		int a[][] = new int[10][10];
		int i, j, menor = 100, lin = 0, col = 0;
		
		Random aleat = new Random();

		System.out.println("Matriz gerada");
		for (i = 0; i < 10; i++) 
		{
			for (j = 0; j < 10; j++) 
			{
				a[i][j] = aleat.nextInt(98) + 1;
				if (a[i][j] < menor) 
				{
					menor = a[i][j];
					lin = i;
					col = j;
				}
				System.out.printf(" [%02d] ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nO menor elemento é " + menor + " na linha " + lin + " na coluna " + col);
	}

}
