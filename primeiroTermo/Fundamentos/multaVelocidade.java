package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class multaVelocidade {

	public static void main(String[] args) {
		
		float v, vr, dif;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite a velocidade do carro: ");
		v = leia.nextFloat();
		
		System.out.print("Digite a velocidade permitida na rua: ");
		vr = leia.nextFloat();
		
		dif = (v - vr);
				
		if (v < vr)
			System.out.print("Você não foi multado, parabéns!");
		else
			if (dif <= 10)
				System.out.print("Sua multa foi de R$ 50,00 reais.");
			else
				if (dif <= 30)
					System.out.print("Sua multa foi de R$ 100,00 reais.");
				else
					System.out.print("Sua multa foi de R$ 300,00 reais.");
		leia.close();

	}

}