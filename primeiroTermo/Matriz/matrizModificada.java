package primeiroTermo.Matriz;

import java.util.Random;
import java.util.Scanner;

public class matrizModificada {

	public static void main(String[] args) {
		
		int a[][] = new int[10][10];
		int i, j, col, num;
		
		Random aleat = new Random();
		Scanner leia = new Scanner(System.in);

		System.out.println("Matriz gerada");
		for (i = 0; i < 10; i++) 
		{
			for (j = 0; j < 10; j++) 
			{
				a[i][j] = aleat.nextInt(100);
				System.out.printf("[%02d]", a[i][j]);
			}
			System.out.println();
		}

		do {
			System.out.print("\n\nInforme a coluna -> ");
			col = leia.nextInt();
			if (col < 0 || col > 9)
				System.out.println("Valor inválido!! Digite novamente.");
		} while (col < 0 || col > 9);
		
		System.out.print("Informe um número -> ");
		num = leia.nextInt();

		for (i = 0; i < 10; i++)
			a[i][col] *= num;

		System.out.println("\nMatriz modificada");
		for (i = 0; i < 10; i++) 
		{
			for (j = 0; j < 10; j++) 
			{
				System.out.printf("[%03d]", a[i][j]);
			}
			System.out.println();
		}
		leia.close();
	}

}
