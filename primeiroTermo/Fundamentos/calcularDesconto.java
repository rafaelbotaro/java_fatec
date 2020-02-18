package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class calcularDesconto {

	public static void main(String[] args) {
	
		float pr, np;
		
		Scanner leia = new Scanner (System.in);

		System.out.print("Digite o preço do produto: ");
		pr = leia.nextFloat();
		System.out.println();
				
		np = pr * 0.9f;

		System.out.println("O preço com o desconto é R$ "+np+ " reais.");
		leia.close();
		
	}

}