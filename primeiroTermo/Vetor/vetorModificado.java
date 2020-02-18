package primeiroTermo.Vetor;

import java.util.Scanner;

public class vetorModificado {

	public static void main(String[] args) {

		int a[] = new int[20];
		int i, aux;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite os 20 valores do vetor: ");
		for (i = 0; i < 20; i++)
			a[i] = leia.nextInt();
		System.out.println();

		for (i = 0; i < 10; i++) 
		{
			aux = a[i];
			a[i] = a[i + 10];
			a[i + 10] = aux;
		}

		System.out.println("Vetor Modificado");
		for (i = 0; i < 20; i++)
			System.out.print(" " + a[i]);
		leia.close();

	}

}
