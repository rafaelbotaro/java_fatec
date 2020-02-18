package primeiroTermo.Trabalhos;

import java.util.Random; 			//importando o random
import java.util.Scanner; 			//importando o scanner

public class cacaNumComentado {

	public static void main(String[] args) {

		int mat[][] = new int[10][10]; 					//declarando a matriz
		int i = 0, j = 0, numero, cent, dez, uni; 		//declarando vari�veis inteiras
		boolean existe=false; 							//declarando boolean para comparar se n�mero existe

		Random aleat = new Random(); 					//declarando random
		Scanner leia = new Scanner (System.in); 		//declarando o scanner

		for (i = 0; i < 10; i++) 						//criando as linhas da matriz
			for (j = 0; j < 10; j++) 					//criando as colunas da matriz
				mat[i][j] = aleat.nextInt(9); 			//atribuindo n�meros de 0 a 9 � matriz

		System.out.println("Matriz \n"); 				//printando a string matriz
		for (i = 0; i < 10; i++) 						//percorrendo e printando as linhas
		{
			for (j = 0; j < 10; j++) 					//percorrendo e printando as colunas
				System.out.printf(mat[i][j] + " "); 	//print completo da matriz
			System.out.println(); 						//quebra uma linha dentro da matriz
		}
		
		System.out.println(); 							//quebra de linha fora da matriz
		
		do { 														//estrutura de repeti��o para testar o n�mero digitado
			System.out.print("Digite um n�mero de 100 a 999: "); 	//pede o n�mero ao usu�rio
			numero = leia.nextInt(); 								//guarda o n�mero na vari�vel n�mero
			
			if ((numero < 100) || (numero > 999)) 					//comara para ver se o n�mero � v�lido
					System.out.println("N�mero Inv�lido\n"); 		//print mensagem n�mero inv�lido
		
		} while ((numero < 100) || (numero > 999)); 				//condi��o da estrutura de repeti��o
		
		System.out.println("\nEntrada: " + numero); 				//printa o n�mero que foi digitado
		
		cent = numero / 100; 										//separa a centena do n�mero
		dez = (numero % 100) / 10; 									//separa a dezena do n�mero
		uni = numero % 10; 											//separa a unidade do n�mero
		
		for (i = 0; i < 10; i++) 									//percorre as linhas da matriz
		{
			for (j = 0; j < 10; j++) 								//percorre as colunas da matriz
			{
				if (mat[i][j]==cent) 								//compara se posi��o da matriz � igual cent
				{
																			//da esquerda para a direita -->
					if (j<8 && mat[i][j+1]==dez && mat[i][j+2]==uni) 		//compara se posi��o da matriz � igual dez e uni
					{
						System.out.print("Sa�da: " +i+j+ " " +i+(j+1)+ " " +i+(j+2)); 		//imprime a sequ�ncia de casas dos n�meros
						existe=true; 														//verifica se n�mero existe na matriz
						break; 																//breca a busca do n�mero e sai do if
					}
																							//da direita para a esquerda <--
						if (j>1 && mat[i][j-1]==dez && mat[i][j-2]==uni) 					//compara se posi��o da matriz � igual dez e uni
						{
							System.out.print("Sa�da: " +i+j+ " " +i+(j-1)+ " " +i+(j-2)); 	//imprime a sequ�ncia de casas dos n�meros
							existe=true; 													//verifica se n�mero existe na matriz
							break; 															//breca a busca do n�mero e sai do if
						}
																								//de baixo para cima ^
							if (i>1 && mat[i-1][j]==dez && mat[i-2][j]==uni) 					//compara se posi��o da matriz � igual dez e uni
							{
								System.out.print("Sa�da: " +i+j+ " " +(i-1)+j+ " " +(i-2)+j); 	//imprime a sequ�ncia de casas dos n�meros
								existe=true; 													//verifica se n�mero existe na matriz
								break; 															//breca a busca do n�mero e sai do if
							}
																									//de cima para baixo v
								if (i<8 && mat[i+1][j]==dez && mat[i+2][j]==uni) 					//compara se posi��o da matriz � igual dez e uni
								{
									System.out.print("Sa�da: " +i+j+ " " +(i+1)+j+ " " +(i+2)+j); 	//imprime a sequ�ncia de casas dos n�meros
									existe=true; 													//verifica se n�mero existe na matriz
									break; 															//breca a busca do n�mero e sai do if
								}
				}
				
			}
			
		if (existe) 			//confirma que numero existe 
			break; 				//breca a busca e finaliza o programa
		
		}
		
		if (!existe) 											//confirma que n�mero n�o existe
			System.out.println("Esse n�mero n�o existe!"); 		//printa para usu�rio que n�mero procurado n�o existe	
		leia.close(); 											//fecha a classe leia
		
	}
	
}