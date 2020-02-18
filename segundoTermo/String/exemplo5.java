package segundoTermo.String;

import java.util.Scanner;

public class exemplo5 {

	public static void main(String[] args) {

		String nome, palavra;
		Scanner leia = new Scanner (System.in);

		System.out.print("Informe seu nome: ");
		nome = leia.nextLine().toUpperCase();
		
		System.out.print("Informe uma palavra: ");
		palavra = leia.nextLine().toUpperCase();

		if (nome.contains(palavra)) //contains pesquisa a sequência de caracteres em nome e vê se é igual em palavra
			System.out.println(palavra+" está contido em "+nome);
		else
			System.out.println(palavra+" não está contida em "+nome);
		leia.close();
		
	}

}