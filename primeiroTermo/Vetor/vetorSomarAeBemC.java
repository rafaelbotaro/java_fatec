package primeiroTermo.Vetor;

import java.util.Random;

public class vetorSomarAeBemC {
	
	public static void main(String[] args) {

		int a[] = new int [10];
		int b[] = new int [10];
		int c[] = new int [10];
		int i;
		
		Random aleat = new Random();
		
		for (i = 0; i < 10; i++)
			a[i] = aleat.nextInt(50);
		
		System.out.print("VETOR A: ");
		for (i = 0; i < 10; i++)
			System.out.printf("[%02d] ", a[i]);
		
		System.out.println();

		for (i = 0; i < 10; i++)
			b[i] = aleat.nextInt(50);
		
		System.out.print("VETOR B: ");
		for (i = 0; i < 10; i++)
			System.out.printf("[%02d] ", b[i]);
		
		for (i = 0; i < 10; i++)
			c[i] = a[i] + b[i];
			
		System.out.println("\n");
			
		System.out.print("VETOR C: ");
		for (i = 0; i < 10; i++)
			System.out.printf("[%02d] ", c[i]);
		
	}
	
}