package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class maiorNumero {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		a = leia.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		b = leia.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		c = leia.nextInt();
		System.out.println();
		
		System.out.println("I n�mero: " +a);
		System.out.println("II n�mero: " +b);
		System.out.println("III n�mero: " +c);
		System.out.println();

		
		if ((a>b) && (a>c))
			System.out.println("O n�mero " +a+ " � o maior.");
		else
			if (b>c)
				System.out.println("O n�mero " +b+" � o maior.");
			else
				System.out.println("O n�mero " +c+" � o maior.");
		leia.close();
	
	}
}