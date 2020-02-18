package primeiroTermo.Vetor;

import java.util.Random;

public class vetorDivisaoMenor {

	public static void main(String[] args) {

		int a[] = new int[20];
		int i, menor;

		Random aleat = new Random();

		for (i = 0; i < 20; i++)
			a[i] = aleat.nextInt(99)+2;

		System.out.println("Vetor: \n");
		for (i = 0; i < 20; i++)
			System.out.print(a[i] + "   ");
		System.out.println();
		
		menor = a[0];
		
		for (i = 1; i < 20; i++)
			if (a[i] < menor)
				menor = a[i];
		
		for (i = 0; i < 20; i++)
			a[i] /= menor;

		System.out.println();
		System.out.println("\nResultado da divisão: \n");
		for (i = 0; i < 20; i++)
			System.out.print(a[i] + "   ");
		
	}

}