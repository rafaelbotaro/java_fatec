package primeiroTermo.Vetor;

import java.util.Random;

public class vetorBQuadradoA {

	public static void main(String[] args) {
		
		int a[] = new int [15];
		int b[] = new int [15];
		int i;
		
		Random aleat = new Random();
		
		for (i = 0; i < 15; i++)
			a[i] = aleat.nextInt(9) + 1;
		
		System.out.print("VETOR A: ");
		for (i = 0; i < 15; i ++)
			System.out.printf("[%02d] ", a[i]);
		
		System.out.println();
		
		for (i = 0; i < 15; i++)
			b[i] = a[i] * a[i];
		
		System.out.print("VETOR B: ");
		for (i = 0; i < 15; i++)
			System.out.printf("[%02d] ", b[i]);
			
	}

}
