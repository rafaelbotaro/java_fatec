package terceiroTermo.listaContigua;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		No a;
		Vetor lista = new Vetor();
		int op;
		
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\n1 - Inserir no fim");
			System.out.println("2 - Imprimir a lista");
			System.out.println("3 - Consultar aluno");
			System.out.println("0 - Sair do programa\n");
			
			System.out.print("Digite a opção: ");
			op = leia.nextInt();
			
			switch (op) {
			
			case 1: a = new No();
			
				System.out.print("\nDigite o nome: ");
				a.setNome(leia.next());
				System.out.print("Digite o RA: ");
				a.setRa(leia.next());
				System.out.print("Digite o Curso: ");
				a.setCurso(leia.next());
				System.out.println();
				lista.inserirFim(a);
				break;
			
			case 2:	System.out.println("Lista: \n");
					lista.imprimir();
					break;
					
			case 3: a = new No();
			
			System.out.print("\nDigite o nome que procura: ");
			a.setNome(leia.next());
			
			No r = new No();
			
			r = lista.consultar(a);
			
			if (r == null) 
				System.out.println("Não cadastrado");
			 else {
				System.out.println("Nome: "+r.getNome());
				System.out.println("RA: "+r.getRa());
				System.out.println("Curso: "+r.getCurso());
			}
			
			}
			
		} while (op != 0);

		leia.close();
		
		}
		

	}
