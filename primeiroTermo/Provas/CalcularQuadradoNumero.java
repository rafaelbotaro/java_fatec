package primeiroTermo.Provas;

import java.util.Scanner;

public class CalcularQuadradoNumero {

	public static void main(String[] args) {

		int n, q = 0, c, x = 1;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um número para calcular o seu quadrado: ");
		n = leia.nextInt();
		System.out.println();
		
		for (c = 1; c <= n; c++)
		{
			q += x;
			x += 2;
		}

		System.out.println("O quadrado de " +n+ " é " +q+ ".");
		leia.close();
	}

}
