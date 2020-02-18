package primeiroTermo.Vetor;

public class vetorMultOnze {

	public static void main(String[] args) {

		int a[] = new int [10];
		int i;
		
		for (i = 0; i < 10; i++)
			a[i] = (i + 1) * 11;
		
		System.out.println("Vetor dos múltiplos de 11: \n");
		for (i = 0; i < 10; i++)
			System.out.print(a[i] + "  ");

	}

}