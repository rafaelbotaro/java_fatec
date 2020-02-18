package primeiroTermo.Matriz;

import java.util.Random;
import java.util.Scanner;

public class matrizElemVetorLinha {

	public static void main(String[] args) {
		
		int a[][] = new int[10][10];
		int b[] = new int[10];
		int i, j, lin;
		
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
			System.out.print("\nInforme a linha -> ");
			lin = leia.nextInt();
			if (lin < 0 || lin > 10)
				System.out.println("Valor inválido!! Digite novamente.");
		} while (lin < 0 || lin > 10);

		System.out.println("\nVetor com os elementos da linha " + lin);

		for (j = 0; j < 10; j++) 
		{
			b[j] = a[lin][j];
			System.out.printf("[%02d]", b[j]);
		}
		leia.close();
	}

}
