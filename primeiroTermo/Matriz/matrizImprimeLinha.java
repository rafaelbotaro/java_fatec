package primeiroTermo.Matriz;

import java.util.Random;
import java.util.Scanner;

public class matrizImprimeLinha {

	public static void main(String[] args) {
		
		int a[][] = new int[7][4];
		int i, j, lin;
		
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
			System.out.print("\nInforme uma linha -> ");
			lin = leia.nextInt();
			if (lin < 0 || lin > 6)
				System.out.println("Valor inválido!! Digite novamente.");
		} while (lin < 0 || lin > 6);

		for (j = 0; j < 4; j++)
			System.out.printf("[%02d]", a[lin][j]);
		leia.close();
	}

}
