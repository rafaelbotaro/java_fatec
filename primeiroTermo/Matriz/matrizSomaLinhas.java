package primeiroTermo.Matriz;

import java.util.Random;

public class matrizSomaLinhas {

	public static void main(String[] args) {
		
		int a[][] = new int[10][10];
		int i, j, soma;
		
		Random aleat = new Random();

		System.out.println("Matriz gerada \n");
		for (i = 0; i < 10; i++) 
		{
			soma = 0;
			for (j = 0; j < 10; j++) 
			{
				a[i][j] = aleat.nextInt(50) + 1;
				System.out.printf(" [%02d] ", a[i][j]);
				soma += a[i][j];
			}
			System.out.println(" >> Soma = " + soma);
		}

	}

}
