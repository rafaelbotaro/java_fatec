package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class separarCenDezUni {
	
	public static void main(String[] args) {

		int num, c, d, u;
	
		Scanner entrada = new Scanner (System.in);
	
		System.out.print("Digite um número de 3 algarismos: ");
		num = entrada.nextInt();
		System.out.println();
		
		c = num / 100;
		d = (num % 100) / 10;
		u = num % 10;
		
		System.out.print("A centena é: "+c+"\nA dezena é: "+d+"\nA unidade é: "+u);
		entrada.close();
		
	}
	
}