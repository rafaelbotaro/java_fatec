package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class votar {

	public static void main(String[] args) {
		
		int i;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite sua idade: ");
		i = leia.nextInt();
		System.out.println();
		
		if (i<16) 
			System.out.println("N�o pode votar.");
		else
			if ((i>=18) && (i<65))
				System.out.println("O voto � obrigat�rio.");
			else
				System.out.println("O voto � facultativo.");
		leia.close();
	}
}