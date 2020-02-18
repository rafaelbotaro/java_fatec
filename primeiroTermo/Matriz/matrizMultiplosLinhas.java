package primeiroTermo.Matriz;

public class matrizMultiplosLinhas {

	public static void main(String[] args) {

		int m[][] = new int[5][5];
		int i, j = 0;

		System.out.println("Matriz: ");
		for (i = 0; i < 5; i++) 
		{
			for (j = 0; j < 5; j++) 
			{
				m[i][j] = i * j;
				System.out.printf("[%3d] ", +m[i][j]);
			}

			System.out.println();
		}

	}

}
