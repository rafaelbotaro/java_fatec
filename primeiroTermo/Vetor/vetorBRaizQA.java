package primeiroTermo.Vetor;

import java.util.Random;

public class vetorBRaizQA {

	public static void main(String[] args) {
		
		float a[] = new float [10];
		float b[] = new float [10];
		int i;
		
		Random aleat = new Random();
		
		for (i = 0; i< 10; i ++)
			a[i] = aleat.nextInt(500);
		
		System.out.print("VETOR A: ");
		for (i = 0; i < 10; i++)
			System.out.printf("[%.1f] ", a[i]);
		
		System.out.println();
		
		for (i = 0; i < 10; i++)
			b[i] = (float) Math.sqrt(a[i]);
		
		System.out.print("VETOR B: ");
		for (i = 0; i < 10; i++)
		System.out.printf("[%.2f] ", b[i]);
		
	}

}