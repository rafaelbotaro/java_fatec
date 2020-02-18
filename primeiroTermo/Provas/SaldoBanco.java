package primeiroTermo.Provas;

import java.util.Scanner;

public class SaldoBanco {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		float sa, s, d, c;
		int cc;
		
		Scanner leia = new Scanner (System.in);

		System.out.print("Para iniciar, por favor digite o número da sua conta: ");
		cc = leia.nextInt();
		System.out.println();
		
		System.out.print("Agora, digite o valor que tem de saldo na sua conta: R$ ");
		s = leia.nextFloat();
		
		System.out.print("A seguir, digite o valor a ser debitado da sua conta: R$ ");
		d = leia.nextFloat();
		
		System.out.print("Por fim, digite o valor a ser creditado na sua conta: R$ ");
		c = leia.nextFloat();
		System.out.println();
		
		sa = (s - d) + c;
		
		if (sa < 0)
			System.out.println("Saldo NEGATIVO em R$ " +sa+ " reais.");
		else
			if (sa == 0)
				System.out.println("Seu saldo está ZERADO -> R$ " +sa+ " reais.");
			else
				System.out.println("Seu saldo está POSITIVO em R$ " +sa+ " reais.");
		leia.close();

	}

}
