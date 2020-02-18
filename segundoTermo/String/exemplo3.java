package segundoTermo.String;

import java.util.Scanner;

public class exemplo3 {

	public static void main(String[] args) {
		
		int i;
		String nome;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Informe seu nome: ");
		nome = leia.nextLine().toUpperCase();
		System.out.println("Nome: "+nome);
				
		for (i = 0; i < nome.length(); i++)	//length percorre a extensão do nome
			System.out.println("Letra: "+nome.charAt(i)); //charAt(i) imprime todas as letras dentro do for 
		leia.close();

	}

}