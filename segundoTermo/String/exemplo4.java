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
		
		
		if (a.equals(b)) //equals verifica igualdade entre elementos inclusive mai�scula e min�scula
			System.out.println("S�o Iguais");
		else
			System.out.println("S�o Diferentes");
		
		
		if (a.equalsIgnoreCase(b)) //equals verifica igualdade entre elementos desconsiderando mai�scula e min�scula
			System.out.println("S�o Iguais");
		else
			System.out.println("S�o Diferentes");
		
		
		if (a.compareTo(b) < 0) //retorna a diferen�a dos nomes definindo a ordem alfab�tica entre elas.
			System.out.println(a+" � menor que "+b);
		else
			if (a.compareTo(b) == 0)
				System.out.println(a+" � igual que "+b);
			else
				System.out.println(a+" � maior que "+b);
		leia.close();
		
	}

}