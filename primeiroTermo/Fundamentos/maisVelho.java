package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class maisVelho {

	public static void main(String[] args) {

		float id, mi, soma=0;
		int cont = 1;

		Scanner leia = new Scanner(System.in);

		while (cont <= 10) {

			System.out.print("Digite a idade: ");
			id = leia.nextFloat();

			soma += id;
			cont++;

			mi = (soma / 10);
			System.out.print("A média de idades é: " + mi);

		}
		leia.close();
	}
}