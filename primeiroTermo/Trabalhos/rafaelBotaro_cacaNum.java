package primeiroTermo.Trabalhos;

import java.util.Random;
import java.util.Scanner;

public class rafaelBotaro_cacaNum {

	public static void main(String[] args) {

		int mat[][] = new int[10][10];
		int i = 0, j = 0, numero, cent, dez, uni;
		boolean existe=false;

		Random aleat = new Random();
		Scanner leia = new Scanner (System.in);

		for (i = 0; i < 10; i++) 
			for (j = 0; j < 10; j++)
				mat[i][j] = aleat.nextInt(9);

		System.out.println("Matriz \n");
		for (i = 0; i < 10; i++) 
		{
			for (j = 0; j < 10; j++)
				System.out.printf(mat[i][j] + " ");
			System.out.println();
		}
		
		System.out.println();
		
		do {
			
			System.out.print("Digite um número de 100 a 999: ");
			numero = leia.nextInt();
			
			if ((numero < 100) || (numero > 999))
					System.out.println("Número Inválido\n");
		
		} while ((numero < 100) || (numero > 999));
		
		System.out.println("\nEntrada: " + numero);
		
		cent = numero / 100;
		dez = (numero % 100) / 10;
		uni = numero % 10;
		
		for (i = 0; i < 10; i++)
		{
			for (j = 0; j < 10; j++)
			{
				if (mat[i][j]==cent)
				{
					if (j<8 && mat[i][j+1]==dez && mat[i][j+2]==uni)
					{
						System.out.print("Saída: " +i+j+ " " +i+(j+1)+ " " +i+(j+2));
						existe=true;
						break;
					}
						if (j>1 && mat[i][j-1]==dez && mat[i][j-2]==uni)
						{
							System.out.print("Saída: " +i+j+ " " +i+(j-1)+ " " +i+(j-2));
							existe=true;
							break;
						}
							if (i>1 && mat[i-1][j]==dez && mat[i-2][j]==uni)
							{
								System.out.print("Saída: " +i+j+ " " +(i-1)+j+ " " +(i-2)+j);
								existe=true;
								break;
							}
								if (i<8 && mat[i+1][j]==dez && mat[i+2][j]==uni)
								{
									System.out.print("Saída: " +i+j+ " " +(i+1)+j+ " " +(i+2)+j);
									existe=true;
									break;
								}
				}
				
			}
			
		if (existe)
			break;
		
		}
		
		if (!existe)
			System.out.println("Esse número não existe!");	
		leia.close();
		
	}
	
}