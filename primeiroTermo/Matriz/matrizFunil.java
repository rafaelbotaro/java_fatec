package primeiroTermo.Matriz;

public class matrizFunil {

	public static void main(String[] args) {

		int a[][] = new int[7][7];
		int i, j;

		for (i = 0; i < 7; i++)
			for (j = 0; j < 7; j++)
				if ((i <= j) && (i + j <= 6) || (i >= j) && (i + j >= 6))
					a[i][j] = 1;
				else
					a[i][j] = 0;

		System.out.println("FUNIL \n");

		for (i = 0; i < 7; i++) 
		{
			for (j = 0; j < 7; j++)
				System.out.print(a[i][j] + " ");
			System.out.print("\n");
		}

	}

}