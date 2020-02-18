package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class precoCombustivel {

	public static void main(String[] args) {
	
		float val, pre, lit;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o valor a abastecer: ");
		val = leia.nextFloat();
		
		System.out.print("Digite o preço do combustível: ");
		pre = leia.nextFloat();
		System.out.println();
		
		lit = val / pre;

		System.out.println("O total a abstecer será de "+lit+ " litros.");
		leia.close();

	}

}
