package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class trocaVariavel2 {
	
	public static void main (String[] args) {
		
		int a, b, c, d;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print ("Digite o valor de A: ");
		a = leia.nextInt ();
		
		System.out.print ("Digite o valor de B: ");
		b = leia.nextInt ();
		
		System.out.print ("Digite o valor de C: ");
		c = leia.nextInt ();
		System.out.println ();
		
		System.out.println ("AGORA -->  A = " +a+ ", B = " +b+ ", C = " +c);
		System.out.println ("\n\n");
		
		System.out.println ("*** TROCA ***");
		System.out.println ();
		
		
		if ((a > b) || (a > c))
			if ( b< c)
			{
				d = a;
				a = b;
				b = d;
			}
			else
			{
				d = a;
				a = c;
				c = d;
			}
		if (b > c)
		{
			d = b;
			b = c;
			c = d;
		}
		
		System.out.print ("A = " +a+ ", B = " +b+ ", C = " +c);
		leia.close();
	}

}
