package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class numeroAscendente {

	public static void main(String[] args) {

		int num, c, d, u;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um n�mero de 3 algarismos entre 100 e 999: ");
		num = leia.nextInt();
		
		if (num < 100 || num > 999)
			System.out.println("\nNumero inv�lido! \n\nPor favor, digite um n�mero de 3 algarismos\nque esteja entre 100 e 999.");
		else
		{
			c = num / 100;
			d = num % 100 / 10;
			u = num % 10;
			
			if (c < d && d < u)
				System.out.println("\nO n�mero � Ascendente!");
			else
				System.out.println("\nO n�mero n�o � Ascendente.");
		}
		leia.close();
	}
}