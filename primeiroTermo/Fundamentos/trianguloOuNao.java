package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class trianguloOuNao {
	
	public static void main (String[] args) {
		
		int a, b, c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print ("Digite o lado A: ");
		a = leia.nextInt ();
		
		System.out.print ("Digite o lado B: ");
		b = leia.nextInt ();
		
		System.out.print ("Digite o lado C: ");
		c = leia.nextInt ();
		System.out.println ();
		
		if ((a < b+c) && (b < a+c) && (c < a+b))
		{
			System.out.print ("É um triângulo: ");
			if ((a == b) && (b == c))
				System.out.print ("Equilátero");
			else 
				if ((a == b) || (a == c) || (b ==c))
					System.out.print("Isóceles");				
				else
					System.out.print ("Escaleno");
		}
		else
			System.out.println ("Não é um triângulo!");
		leia.close();
		
	}

}
