package primeiroTermo.Vetor;

import java.util.Scanner;

public class vetorDosImpares {

	public static void main(String[] args) {

		int i, imp = 1;
		int a[] = new int[20];

		Scanner leia = new Scanner(System.in);

		for (i = 0; i < 20; i++, imp += 2)
			a[i] = imp;

		System.out.println("Vetor dos Ímpares: ");
		for (i = 0; i < 20; i++)
			System.out.print(" " + a[i]);
		leia.close();

	}

}