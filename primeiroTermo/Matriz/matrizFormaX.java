package primeiroTermo.Matriz;

public class matrizFormaX {

	public static void main(String[] args) {
		
		int m[][] = new int[5][5];
		int i, j = 0;

		System.out.println("Matriz em forma de X: \n");
		for (i = 0; i < 5; i++) 
		{
			for (j = 0; j < 5; j++) 
			{
				if ((i == j) || (i + j == 4))
					m[i][j] = 1;
				else
					m[i][j] = 0;
				System.out.printf("[%d] ", +m[i][j]);
			}
			
			System.out.println();
			
		}

	}

}