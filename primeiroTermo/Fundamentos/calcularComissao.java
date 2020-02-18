package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class calcularComissao {
	
	public static void main(String[] args) {
		
		float sal, ven, com, salf;
		String fun;
		
		Scanner leia = new Scanner (System.in);
	
		System.out.print("Digite o nome do funcionário: ");
		fun = leia.nextLine();
		
		System.out.print("Digite o salário do(a) " +fun+ " : ");
		sal = leia.nextFloat();
		
		System.out.print("Digite o total de vendas: R$ ");
		ven = leia.nextFloat();
		System.out.println();
				
		com = ven * 0.04f;
		salf = sal + com;
				
		System.out.println("O salário do(a) " +fun+ " é R$ "+sal+ " reais.");
		System.out.println("O total de vendas do(a) " +fun+ " é R$ "+ven+ " reais.");
		System.out.println("A comissão sobre as vendas do(a) " +fun+ " é R$ "+com+ " reais.");
		System.out.println();
		System.out.println("O salário do(a) " +fun+ ", somado com a comissão, é R$ "+salf+ " reais.");
		leia.close();
	}

}
