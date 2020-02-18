package primeiroTermo.Vetor;

import java.util.Random;

public class vetorAeBIguais {

	public static void main(String[] args) {

		int a[] = new int [5];
		int b[] = new int [5];
		int i;
		
		Random aleat = new Random();
		
		for (i = 0; i < 5; i++)
			a[i] = aleat.nextInt(50) + 1;
		
		System.out.print("VETOR A: ");
		for (i = 0; i < 5; i++)
			System.out.printf("[%02d] ", a[i]);
		
		for (i = 0; i < 5; i++)
			b[i] = a[i];
			
		System.out.println("\n");
		
		System.out.print("VETOR B: ");
		for (i = 0; i < 5; i++)
			System.out.printf("[%02d] ", b[i]);
	}
}