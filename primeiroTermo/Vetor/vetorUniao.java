package primeiroTermo.Vetor;

import java.util.Scanner;

public class vetorUniao {

	public static void main(String[] args) {

		boolean existe;
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[20];
		int i, j, k;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite os valores de A: ");
		for (i = 0; i < 10; i++)
			a[i] = leia.nextInt();
		System.out.println();

		System.out.print("Digite os valores de B: ");
		for (i = 0; i < 10; i++)
			b[i] = leia.nextInt();
		System.out.println();

		for (i = 0; i < 10; i++)
			c[i] = a[i];

		for (j = 0, k = 10; j < 10; j++) {
			existe = false;
			for (i = 0; i < 10; i++) 
			{
				if (a[i] == b[j]) 
				{
					existe = true;
					break;
				}
			}
			
			if (!existe)
				c[k++] = b[j];
		}

		System.out.println("Vetor União");
		for (i = 0; i < k; i++)
			System.out.print(" " + c[i]);
		leia.close();

	}

}