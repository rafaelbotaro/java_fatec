package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class separarCenDezUni {
	
	public static void main(String[] args) {

		int num, c, d, u;
	
		Scanner entrada = new Scanner (System.in);
	
		System.out.print("Digite um n�mero de 3 algarismos: ");
		num = entrada.nextInt();
		System.out.println();
		
		c = num / 100;
		d = (num % 100) / 10;
		u = num % 10;
		
		System.out.print("A centena �: "+c+"\nA dezena �: "+d+"\nA unidade �: "+u);
		entrada.close();
		
	}
	
}