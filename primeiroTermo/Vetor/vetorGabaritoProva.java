package primeiroTermo.Vetor;

import java.util.Scanner;

public class vetorGabaritoProva {

	public static void main(String[] args) {

		char g[] = { 'b', 'c', 'd', 'a', 'e', 'e', 'b', 'c', 'a', 'd' };
		char p[] = new char[10];
		char resp;
		int nota, i;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite as respostas da prova: ");
		for (i = 0; i < 10; i++)
			p[i] = leia.next().charAt(0);

		nota = 0;

		for (i = 0; i < 10; i++)
			if (g[i] == p[i])
				nota++;

		System.out.println("\nNota = " + nota);
		System.out.print("\nCorrigir outra prova? (s/n): ");
		resp = leia.next().charAt(0);
		while (resp == 's');
		leia.close();
	}

}