package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class numIgualDiferenca {

	public static void main(String[] args) {
		
		float a, b;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um n�mero: ");
		a = leia.nextFloat();
		
		System.out.print("Digite outro n�mero: ");
		b = leia.nextFloat();
		System.out.println();
		
		if (a == b)
			System.out.println("Os n�meros s�o iguais.");
		else
			System.out.println("Os n�meros s�o diferentes.");
		leia.close();
	
	}
	
}