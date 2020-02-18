package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class alunoAprovadoReprovado {

	public static void main(String[] args) {
		
		float n1, n2, med;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println();
		
		med = (n1 + n2) / 2;
		
		if (med >= 6) {
			System.out.println("A média do aluno é "+med+"!");
			System.out.println();
			System.out.println("Ele foi APROVADO!");
		}
		else {
			System.out.println("A média do aluno é "+med+"!");
			System.out.println();
			System.out.println("Ele foi REPROVADO!");
		}	
		leia.close();
	}
}