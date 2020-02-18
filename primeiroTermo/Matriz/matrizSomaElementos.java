package primeiroTermo.Matriz;

import java.util.Scanner;

public class matrizSomaElementos {

	public static void main(String[] args) {

		int A[][] = new int[2][3];
		int i, j, soma = 0;

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe os 6 valores da matriz \n");
		for (i = 0; i < 2; i++) 
		{
			for (j = 0; j < 3; j++) 
			{
				System.out.print("[" + i + "][" + j + "] -> ");
				A[i][j] = leia.nextInt();
				soma += A[i][j];
			}
		}
		System.out.println("\n\nElementos informados");
		for (i = 0; i < 2; i++) 
		{
			for (j = 0; j < 3; j++) 
			{
				System.out.printf("[%02d]", A[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nSoma total dos elementos = " + soma);
		leia.close();
	}

}
