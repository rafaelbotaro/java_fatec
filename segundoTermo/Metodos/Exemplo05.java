package segundoTermo.Metodos;

import java.util.Random;

public class Exemplo05 {

	public static void geraVetor(int V[]) {
		int i;
		Random gera = new Random();
		for (i=0;i<V.length;i++)
			V[i] = gera.nextInt(50)+1;
	}
	
	public static void imprimeVetor(int V[], char letra) {
		System.out.println("\n\nNúmeros gerados ("+letra+")");
		for (int i=0;i<V.length;i++)
			System.out.print(V[i]+" ");
	}
	
	public static void main(String[] args) {
		int A[] = new int[10];
		int B[] = new int[20];
		int C[] = new int[5];
		
		geraVetor(A);
		geraVetor(B);
		geraVetor(C);
		
		imprimeVetor(A,'A');
		imprimeVetor(B,'B');
		imprimeVetor(C,'C');

	}

}
