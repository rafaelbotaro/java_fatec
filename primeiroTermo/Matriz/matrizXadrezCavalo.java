package primeiroTermo.Matriz;

import java.util.Scanner;

public class matrizXadrezCavalo {

	public static void main(String[] args) {

		int a[][] = new int[8][8];
		int i, j, l, c;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite as coordenadas do Cavalo: ");
		l = leia.nextInt();
		c = leia.nextInt();
		System.out.println("\n");

		for (i = 0; i < 8; i++)
			for (j = 0; j < 8; j++)
				if (((i == l - 2) || (i == l + 2)) && ((j == c - 1) || (j == c + 1))
						|| ((i == l - 1) || (i == l + 1)) && ((j == c - 2) || (j == c + 2)))
					a[i][j] = 1;
				else
					a[i][j] = 0;

		a[l][c] = 8;
		
		System.out.println("Tabuleiro \n");

		for (i = 0; i < 8; i++) 
		{
			for (j = 0; j < 8; j++)
				System.out.print(a[i][j] + " ");
			System.out.print("\n");
		}
		leia.close();

	}

}
