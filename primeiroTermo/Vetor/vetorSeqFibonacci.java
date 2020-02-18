package primeiroTermo.Vetor;

import java.util.Scanner;

public class vetorSeqFibonacci {

	public static void main(String[] args) {

		int i = 1;
		int a[] = new int[20];

		Scanner leia = new Scanner(System.in);

		for (a[0] = 1, i = 1; i < 20; i++)
			a[i] = a[i - 1] + a[i - 2];

		System.out.println("Sequência de Fiboncci: ");
		for (i = 0; i < 20; i++)
			System.out.print(" " + a[i]);
		leia.close();

	}

}