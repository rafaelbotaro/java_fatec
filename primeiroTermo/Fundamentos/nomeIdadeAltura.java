package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class nomeIdadeAltura {
	
	public static void main(String[] args) {

		String nome;
		int idade;
		float altura;
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("-------------------------");
		System.out.println("*** INSIRA SEUS DADOS ***");
		System.out.println("-------------------------");
		System.out.println();
	
		System.out.print ("Informe seu nome: ");
		nome = entrada.nextLine();
		System.out.print ("Informe sua idade: ");
		idade = entrada.nextInt();
		System.out.print("Informe a sua altura: ");
		altura = entrada.nextFloat();
		
		System.out.println();
		System.out.print("Seu nome é "+nome+"\nSua idade é "+idade+" anos \nSua altura é "+altura+" metros");
		entrada.close();
		
	}
}