package primeiroTermo.Trabalhos;

import java.util.Scanner;

public class usainBolt {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int comp = 1, voltas, volrap = 86500, tvoltas = 0, cont = 1, cont2 = 0, tempo, soma = 0;

		do {

			System.out.print("Digite a quantidade de competidores: ");
			comp = leia.nextInt();

			System.out.print("Digite a quantidade de voltas: ");
			voltas = leia.nextInt();
			System.out.println();

			if ((comp == 0) || (voltas == 0))
				System.out.print("Número de competidores INVÁLIDO!\n\n");

		} while ((comp == 0) || (voltas == 0));

		for (cont = 1; cont <= comp; cont++) 
		{
			System.out.println("Competidor " + cont);
			soma = 0;

			for (cont2 = 1; cont2 <= voltas; cont2++) 
			{
				System.out.print("Digite o tempo da volta: ");
				tempo = leia.nextInt();
				soma += tempo;
			}
			if (soma < volrap) 
			{
				volrap = soma;
				tvoltas = cont;
			}

		}

		System.out.print("\nO competidor que ganhou a corrida foi o número " + tvoltas);
		leia.close();
	}

}
