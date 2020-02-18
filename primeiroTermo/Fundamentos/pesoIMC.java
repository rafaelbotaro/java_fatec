package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class pesoIMC {

	public static void main(String[] args) {
		
		float p, a, imc;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite seu peso: ");
		p = leia.nextFloat();
		System.out.println();
		
		System.out.print("Digite sua altura: ");
		a = leia.nextFloat();
		System.out.println();
		
		imc = p / (a * a);
		
		if (imc < 18)
			System.out.println("Abaixo do peso.");
		else
			if (imc < 25)
				System.out.println("Peso normal.");
			else
				if (imc < 30)
					System.out.println("Acima do peso.");
				else
					System.out.println("Obeso.");
		leia.close();
	}
}
