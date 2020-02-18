package primeiroTermo.Matriz;

import java.util.Random;

public class matrizMesMaiorVenda {

	public static void main(String[] args) {

		int a[][] = new int [4][12];
		int i, j, tm=0, ta=0, maior=0, sem=0, mes=0;
		
		Random aleat = new Random();
		
		for (i = 0; i < 4; i++)
		{
			for (j = 0; j < 12; j++)
			{
				a[i][j] = aleat.nextInt(98)+1;
				System.out.printf(" [%03d] ", a[i][j]);
			}
			System.out.println();
			
		}
		System.out.println();
		
		for (j = 0; j < 12; j++)
		{
			tm = 0;
			for (i = 0; i < 4; i++)
			{
				tm += a[i][j];
				if (a[i][j] > maior)
				{
					maior = a[i][j];
					sem = i+1;
					mes = j+1;
				}
				
			}
			System.out.println("Produção do mês: "+(j+1)+ " = " +tm);
			ta += tm;			
		}
		System.out.println();
		System.out.println("Total da produção anual = " +ta);
		System.out.println("Maior produção = " +maior+ " ocorreu na " +sem+ " semana do mês " +mes);

	}

}
