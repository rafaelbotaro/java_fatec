package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		
		int n1, rest;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		n1 = leia.nextInt();
		System.out.println();
		
		rest = (n1 % 2);
				
		if (rest == 0)
			System.out.println("O número " +n1+ " é par.");
		else
			System.out.println("O número " +n1+" é ímpar.");
		leia.close();
	
	}
}