package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class reajusteSalarial {
	
	public static void main(String[] args) {
		
		float sal, nsal, reaj;
		String fun;
		
		Scanner leia = new Scanner (System.in);
	
		System.out.print("Digite o nome do(a) funcionário(a): ");
		fun = leia.nextLine();
		
		System.out.print("Digite o salário de " +fun+ ": ");
		sal = leia.nextFloat();
		
		System.out.print("Digite o percentual de reajuste: ");
		reaj = leia.nextFloat();
		System.out.println();
		
		nsal = sal + (sal* reaj / 100);

		System.out.println("O novo salário do(a) funcionário(a) " +fun+ " é R$ "+nsal+ " reais.");
		leia.close();

	}

}
