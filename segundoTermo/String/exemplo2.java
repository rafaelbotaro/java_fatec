package segundoTermo.String;

import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {

		String nome, email;
		Scanner leia = new Scanner (System.in);
				
		System.out.print("Informe seu nome: ");
		nome = leia.nextLine().toUpperCase();//transforma nome em mai�sculo
			
		System.out.print("Digite seu email: ");
		email = leia.next().toLowerCase();//transforma email em min�sculo
				
		System.out.println("Nome: "+nome+"\nEmail: "+email);
		leia.close();				
		
	}

}