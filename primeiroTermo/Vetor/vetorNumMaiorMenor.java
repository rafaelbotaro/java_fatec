package primeiroTermo.Vetor;

import java.util.Scanner;

public class vetorNumMaiorMenor {

	public static void main(String[] args) {
		
		int a[] = new int [10];
		int i, maior, menor;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite os 10 elementos do vetor: ");
		for (i = 0; i < 10; i++)
			a[i] = leia.nextInt();
		
		maior = a[0];
		menor = a[0];
		
		for (i = 1; i < 10; i++)
			if (a[i] > maior)
				maior = a[i];
			else
				if (a[i] < menor)
					menor = a[i];
		
		System.out.println("O maior valor é " +maior);
		System.out.println("O menor valor é " +menor);
		leia.close();

	}

}