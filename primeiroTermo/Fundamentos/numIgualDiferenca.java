package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class numIgualDiferenca {

	public static void main(String[] args) {
		
		float a, b;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		a = leia.nextFloat();
		
		System.out.print("Digite outro número: ");
		b = leia.nextFloat();
		System.out.println();
		
		if (a == b)
			System.out.println("Os números são iguais.");
		else
			System.out.println("Os números são diferentes.");
		leia.close();
	
	}
	
}