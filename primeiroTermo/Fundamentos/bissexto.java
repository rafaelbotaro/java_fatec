package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class bissexto {
	
	public static void main (String[] args) {
		
		int a;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print ("Digite um ano: ");
		a = leia.nextInt ();
		System.out.println ();
		
		if ((a % 400 == 0) || (a % 4 == 0) && (a % 100 != 0))
			System.out.print ("O ano " +a+ " é bissexto!");
		else
			System.out.println ("O ano " +a+ " não é bissexto!");
		leia.close();
	}

}