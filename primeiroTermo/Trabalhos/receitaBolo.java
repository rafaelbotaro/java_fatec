package primeiroTermo.Trabalhos;

import java.util.Scanner;

public class receitaBolo {
	
	public static void main (String[] args) {
		
		int a, b, c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print ("Digite a quantidade de xícaras de trigo: ");
		a = leia.nextInt ();
		System.out.println ();
		
		System.out.print ("Digite a quantidade de ovos: ");
		b = leia.nextInt ();
		System.out.println ();
		
		System.out.print ("Digite a quantidade de colheres de leite: ");
		c = leia.nextInt ();
		System.out.println ();
		
		a = (a / 2);
	    b = (b / 3);
	    c = (c / 5);
	    
	    if ((a < b) && (a < c))
	    	System.out.print ("Será produzido " +a+ " bolos.");
	    else
	    	if (b < c)
	    		System.out.print ("Será produzido " +b+ " bolos.");
	    	else
	    		System.out.print ("Será produzido " +c+ " bolos.");
	    leia.close();
	}
}