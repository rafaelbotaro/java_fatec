package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class calcularMedia {

	public static void main(String[] args) {
		
		float n1, n2, med;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println();
		
		med = (n1 + n2) / 2;

		System.out.print("A média obtida pelo aluno foi "+med);
		leia.close();

	}

}