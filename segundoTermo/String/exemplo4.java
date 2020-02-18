package segundoTermo.String;

import java.util.Scanner;

public class exemplo4 {

	public static void main(String[] args) {
		
		String a, b;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um nome: ");
		a = leia.nextLine();
		System.out.println();
		
		System.out.print("Digite outro nome:");
		b = leia.nextLine();
		System.out.println();
		
		
		if (a.equals(b)) //equals verifica igualdade entre elementos inclusive maiúscula e minúscula
			System.out.println("São Iguais");
		else
			System.out.println("São Diferentes");
		
		
		if (a.equalsIgnoreCase(b)) //equals verifica igualdade entre elementos desconsiderando maiúscula e minúscula
			System.out.println("São Iguais");
		else
			System.out.println("São Diferentes");
		
		
		if (a.compareTo(b) < 0) //retorna a diferença dos nomes definindo a ordem alfabética entre elas.
			System.out.println(a+" é menor que "+b);
		else
			if (a.compareTo(b) == 0)
				System.out.println(a+" é igual que "+b);
			else
				System.out.println(a+" é maior que "+b);
		leia.close();
		
	}

}