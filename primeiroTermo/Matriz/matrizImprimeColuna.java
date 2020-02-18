package primeiroTermo.Matriz;

import java.util.Random;
import java.util.Scanner;

public class matrizImprimeColuna {

	public static void main(String[] args) {
		
		int a[][] = new int[7][4];
		int i, j, col;
		
		Random aleat = new Random();
		Scanner leia = new Scanner(System.in);

		System.out.println("Matriz gerada");
		for (i = 0; i < 7; i++) 
		{
			for (j = 0; j < 4; j++) 
			{
				a[i][j] = aleat.nextInt(50) + 1;
				System.out.printf("[%02d]", a[i][j]);
			}
			System.out.println();
		}

		do {
			System.out.print("\nInforme a coluna -> ");
			col = leia.nextInt();
			if (col < 0 || col > 3)
				System.out.println("Valor inválido!! Digite novamente.");
		} while (col < 0 || col > 3);

		for (i = 0; i < 7; i++)
			System.out.printf("[%02d]", a[i][col]);
		leia.close();
	}

}