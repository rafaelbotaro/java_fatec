package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class maiorNumero {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o primeiro número: ");
		a = leia.nextInt();
		
		System.out.print("Digite o segundo número: ");
		b = leia.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		c = leia.nextInt();
		System.out.println();
		
		System.out.println("I número: " +a);
		System.out.println("II número: " +b);
		System.out.println("III número: " +c);
		System.out.println();

		
		if ((a>b) && (a>c))
			System.out.println("O número " +a+ " é o maior.");
		else
			if (b>c)
				System.out.println("O número " +b+" é o maior.");
			else
				System.out.println("O número " +c+" é o maior.");
		leia.close();
	
	}
}