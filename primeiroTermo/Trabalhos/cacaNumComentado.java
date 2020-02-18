package primeiroTermo.Trabalhos;

import java.util.Random; 			//importando o random
import java.util.Scanner; 			//importando o scanner

public class cacaNumComentado {

	public static void main(String[] args) {

		int mat[][] = new int[10][10]; 					//declarando a matriz
		int i = 0, j = 0, numero, cent, dez, uni; 		//declarando variáveis inteiras
		boolean existe=false; 							//declarando boolean para comparar se número existe

		Random aleat = new Random(); 					//declarando random
		Scanner leia = new Scanner (System.in); 		//declarando o scanner

		for (i = 0; i < 10; i++) 						//criando as linhas da matriz
			for (j = 0; j < 10; j++) 					//criando as colunas da matriz
				mat[i][j] = aleat.nextInt(9); 			//atribuindo números de 0 a 9 à matriz

		System.out.println("Matriz \n"); 				//printando a string matriz
		for (i = 0; i < 10; i++) 						//percorrendo e printando as linhas
		{
			for (j = 0; j < 10; j++) 					//percorrendo e printando as colunas
				System.out.printf(mat[i][j] + " "); 	//print completo da matriz
			System.out.println(); 						//quebra uma linha dentro da matriz
		}
		
		System.out.println(); 							//quebra de linha fora da matriz
		
		do { 														//estrutura de repetição para testar o número digitado
			System.out.print("Digite um número de 100 a 999: "); 	//pede o número ao usuário
			numero = leia.nextInt(); 								//guarda o número na variável número
			
			if ((numero < 100) || (numero > 999)) 					//comara para ver se o número é válido
					System.out.println("Número Inválido\n"); 		//print mensagem número inválido
		
		} while ((numero < 100) || (numero > 999)); 				//condição da estrutura de repetição
		
		System.out.println("\nEntrada: " + numero); 				//printa o número que foi digitado
		
		cent = numero / 100; 										//separa a centena do número
		dez = (numero % 100) / 10; 									//separa a dezena do número
		uni = numero % 10; 											//separa a unidade do número
		
		for (i = 0; i < 10; i++) 									//percorre as linhas da matriz
		{
			for (j = 0; j < 10; j++) 								//percorre as colunas da matriz
			{
				if (mat[i][j]==cent) 								//compara se posição da matriz é igual cent
				{
																			//da esquerda para a direita -->
					if (j<8 && mat[i][j+1]==dez && mat[i][j+2]==uni) 		//compara se posição da matriz é igual dez e uni
					{
						System.out.print("Saída: " +i+j+ " " +i+(j+1)+ " " +i+(j+2)); 		//imprime a sequência de casas dos números
						existe=true; 														//verifica se número existe na matriz
						break; 																//breca a busca do número e sai do if
					}
																							//da direita para a esquerda <--
						if (j>1 && mat[i][j-1]==dez && mat[i][j-2]==uni) 					//compara se posição da matriz é igual dez e uni
						{
							System.out.print("Saída: " +i+j+ " " +i+(j-1)+ " " +i+(j-2)); 	//imprime a sequência de casas dos números
							existe=true; 													//verifica se número existe na matriz
							break; 															//breca a busca do número e sai do if
						}
																								//de baixo para cima ^
							if (i>1 && mat[i-1][j]==dez && mat[i-2][j]==uni) 					//compara se posição da matriz é igual dez e uni
							{
								System.out.print("Saída: " +i+j+ " " +(i-1)+j+ " " +(i-2)+j); 	//imprime a sequência de casas dos números
								existe=true; 													//verifica se número existe na matriz
								break; 															//breca a busca do número e sai do if
							}
																									//de cima para baixo v
								if (i<8 && mat[i+1][j]==dez && mat[i+2][j]==uni) 					//compara se posição da matriz é igual dez e uni
								{
									System.out.print("Saída: " +i+j+ " " +(i+1)+j+ " " +(i+2)+j); 	//imprime a sequência de casas dos números
									existe=true; 													//verifica se número existe na matriz
									break; 															//breca a busca do número e sai do if
								}
				}
				
			}
			
		if (existe) 			//confirma que numero existe 
			break; 				//breca a busca e finaliza o programa
		
		}
		
		if (!existe) 											//confirma que número não existe
			System.out.println("Esse número não existe!"); 		//printa para usuário que número procurado não existe	
		leia.close(); 											//fecha a classe leia
		
	}
	
}