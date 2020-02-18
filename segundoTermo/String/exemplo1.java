package segundoTermo.String;

import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {

		String nome;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Informe seu nome: ");
		nome = leia.nextLine();
		nome = nome.toUpperCase();//transforma tudo em maiúsculo
		
		System.out.println("Nome: "+nome);
		System.out.println("Primeira letra: "+nome.charAt(0));	//imprime a letra escolhida
		
		leia.close();
		
	}

}