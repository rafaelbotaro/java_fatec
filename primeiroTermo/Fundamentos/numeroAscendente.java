package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class numeroAscendente {

	public static void main(String[] args) {

		int num, c, d, u;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um número de 3 algarismos entre 100 e 999: ");
		num = leia.nextInt();
		
		if (num < 100 || num > 999)
			System.out.println("\nNumero inválido! \n\nPor favor, digite um número de 3 algarismos\nque esteja entre 100 e 999.");
		else
		{
			c = num / 100;
			d = num % 100 / 10;
			u = num % 10;
			
			if (c < d && d < u)
				System.out.println("\nO número é Ascendente!");
			else
				System.out.println("\nO número não é Ascendente.");
		}
		leia.close();
	}
}