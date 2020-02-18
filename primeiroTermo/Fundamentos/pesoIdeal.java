package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class pesoIdeal {

	public static void main(String[] args) {
		
		float a, pi;
		char s;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite seu sexo: ");
		s = leia.next().toUpperCase().charAt(0);
		System.out.println();
		
		System.out.print("Agora digite sua altura: ");
		a = leia.nextFloat();
		System.out.println();
		
		if (s=='M'){
			pi = (72.7f * a) - 58;
			System.out.println("O peso ideal é: " +pi);
		}
		else
			if (s=='F'){
				pi = (62.1f * a) - 44.7f;
				System.out.println("O peso ideal é: " +pi);
			}
			else
				System.out.println("Sexo inválido!");
		leia.close();
	
	}
}