package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class calcularArea {

	public static void main(String[] args) {
	
		float L, C, P, A;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite a largura do terreno: ");
		L = leia.nextFloat();
		
		System.out.print("Digite o comprimento do terreno: ");
		C = leia.nextFloat();
		System.out.println();
		
		P = 2 * (L + C);
		A = C * L;
				
		System.out.println("O per�metro do terreno � "+P+ " metros.");
		System.out.print("A �rea total do terreno � "+A+ " metros.");
		leia.close();

	}

}
