package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class notaRepeticao {

	public static void main(String[] args) {

		int cont = 1;
		float n1, n2, med;
		@SuppressWarnings("unused")
		String nome;

		Scanner leia = new Scanner(System.in);

			System.out.println("------------------------");
			System.out.println("*** CALCULAR A MÉDIA ***");
			System.out.println("------------------------\n");
			
			while (cont <= 2) {

			System.out.print("Digite o nome do aluno(a): ");
			nome = leia.next();

			System.out.print("Digite a primeira nota: ");
			n1 = leia.nextFloat();

			System.out.print("Digite a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println();

			med = (n1 + n2) / 2;

			if (med >= 6) {
				System.out.println("A média do(a) aluno(a) é " + med + "!");
				System.out.println("> Ele(a) foi APROVADO(A)!\n\n");
	
			} else {
				System.out.println("A média do(a) aluno(a) é " + med + "!\n");
				System.out.println("> Ele(a) foi REPROVADO(A)!\n\n");
			}
			cont++;
		}
		System.out.println("Fim da execução.");
		leia.close();
	}

}