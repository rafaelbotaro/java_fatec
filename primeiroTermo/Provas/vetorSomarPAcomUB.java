package primeiroTermo.Provas;

import java.util.Random;

public class vetorSomarPAcomUB {

	public static void main(String[] args) {

		int a[] = new int [10];
		int b[] = new int [10];
		int c[] = new int [10];
		int i, j;
		
		Random aleat = new Random();
		
		for (i = 0; i < 10; i++)
			a[i] = aleat.nextInt(50) + 1;
		
		System.out.print("VETOR A: ");
		for (i = 0; i < 10; i++)
			System.out.printf("[%02d] ", a[i]);
		
		System.out.println();

		for (j = 0; j < 10; j++)
			b[j] = aleat.nextInt(50) + 1;
		
		System.out.print("VETOR B: ");
		for (j = 0; j < 10; j++)
			System.out.printf("[%02d] ", b[j]);
		
		for (i = 0, j = 9; i < 10; i++, j--)
			c[i] = a[i] + b[j];
			
		System.out.println("\n");
		
			System.out.print("VETOR C: ");
			for (i = 0; i < 10; i++)
				System.out.printf("[%02d] ", c[i]);
			
	}
	
}