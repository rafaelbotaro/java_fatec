package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class trocaVariavel {
	
	public static void main(String[] args) {

		int a, b, c;
	
		Scanner entrada = new Scanner (System.in);
	
		System.out.print ("Digite um valor para A: ");
		a = entrada.nextInt();
		System.out.print ("Digite um valor para B: ");
		b = entrada.nextInt();
		System.out.println();
		
		System.out.println("Na vari�vel A est� armazenado o n�mero "+a);
		System.out.println("Na vari�vel B est� armazenado o n�mero "+b);
		System.out.println();
		
		System.out.println("------------------------");
		System.out.println("********* TROCA ********");
		System.out.println("------------------------");
		System.out.println();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Agora, na vari�vel A est� armazenado o n�mero "+a);
		System.out.println("Agora, na vari�vel B est� armazenado o n�mero "+b);
		entrada.close();
	}
	
}
