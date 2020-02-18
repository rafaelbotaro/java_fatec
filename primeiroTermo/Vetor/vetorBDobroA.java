package primeiroTermo.Vetor;

import java.util.Random;

public class vetorBDobroA {

	public static void main(String[] args) {
		
		int a[] = new int [8];
		int b[] = new int [8];
		int i;
		
		Random aleat = new Random();
		
		for (i = 0; i < 8; i++)
			a[i] = aleat.nextInt(50) +1;
		
		System.out.print("VETOR A: ");
		for (i = 0; i < 8; i++)
			System.out.printf("[%02d] ", a[i]);
		
		System.out.println();
		
		for (i = 0; i < 8; i++)
			b[i] = a[i] * 2;
		
		System.out.print("VETOR B: ");
		for (i = 0; i < 8; i++)
			System.out.printf("[%02d] ", b[i]);

	}

}
