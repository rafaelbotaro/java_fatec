package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class somarDoisNumeros {

	public static void main(String[] args) {
		
		float num1, num2, res;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		num1 = leia.nextFloat();
		
		System.out.print("Digite outro número: ");
		num2 = leia.nextFloat();
		System.out.println();
		
		res = num1 + num2;

		System.out.print("A soma dos dois números é: "+res);
		leia.close();

	}

}