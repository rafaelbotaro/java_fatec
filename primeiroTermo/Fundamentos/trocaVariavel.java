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
		
		System.out.println("Na variável A está armazenado o número "+a);
		System.out.println("Na variável B está armazenado o número "+b);
		System.out.println();
		
		System.out.println("------------------------");
		System.out.println("********* TROCA ********");
		System.out.println("------------------------");
		System.out.println();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Agora, na variável A está armazenado o número "+a);
		System.out.println("Agora, na variável B está armazenado o número "+b);
		entrada.close();
	}
	
}
