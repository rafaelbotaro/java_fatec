package primeiroTermo.Matriz;

public class matrizTabuleiro {

	public static void main(String[] args) {
		
		int m[][] = new int[8][8];
		int i, j = 0;

		System.out.println("Tabuleiro: \n");
		for (i = 0; i < 8; i++) 
		{
			for (j = 0; j < 8; j++) 
			{
				m[i][j] = (i + j) % 2;
				System.out.printf("[%d]  ", +m[i][j]);
			}
			
			System.out.println("\n");
		}

	}

}
