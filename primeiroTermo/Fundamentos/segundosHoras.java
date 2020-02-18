package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class segundosHoras {
	
	public static void main(String[] args) {

		int t, d, h, m, s;
	
		Scanner entrada = new Scanner (System.in);
	
		System.out.print("Digite um tempo em segundos: ");
		t = entrada.nextInt();
		System.out.println();
		
		d = t / 86400;
		h = (t % 86400) / 3600;
		m = (t % 3600) / 60;
		s = t % 60;
		
		System.out.print("Nesse caso temos: "+d+ " dias, "+h+" horas, "+m+" minutos e "+s+ " segundos.");
		entrada.close();
		
	}
	
}