package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class natacao {

	public static void main(String[] args) {
		
		int id;
				
		Scanner leia = new Scanner (System.in);

		System.out.print("Digite a idade do nadador: ");
		id = leia.nextInt();
		System.out.println();
		
		if (id<=8)
			System.out.println("Categoria Infantil A");
		else
			if (id<13)
				System.out.println("Categoria Infantil B");
			else
				if (id<18)
					System.out.println("Categoria Juvenil A");
				else
					if (id<21)
						System.out.println("Categoria Juvenil B");
						else
							System.out.println("Categoria Sênior");
		leia.close();
		
	}
	
}