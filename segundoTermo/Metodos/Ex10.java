package segundoTermo.Metodos;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ex10 {

	public static void geraVetor(int v[])
	{
		Random g = new Random();
		for (int i=0;i<v.length;i++)
		{
			v[i] = g.nextInt(100);
		}
		JOptionPane.showMessageDialog(null, "Vetor gerado com sucesso!!");
	}
	
	public static void imprimeVetor(int v[])
	{
		String listaNum="";
		for (int i=0;i<v.length;i++)
		{
			listaNum+=v[i]+" ";
		}
		JOptionPane.showMessageDialog(null, listaNum);
	}
	
	public static void ordenaVetor(int v[])
	{
		int i, j, x;
		for (i=0;i<v.length;i++)
		{
			for (j=i+1;j<v.length;j++)
			{
				if (v[i]>v[j])
				{
					x=v[i];
					v[i]=v[j];
					v[j]=x;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Vetor ordenado!!");
	}
	
	public static boolean buscaVetor(int v[], int valor)
	{
		for (int i=0;i<v.length;i++)
		{
			if (v[i]==valor)
				return true;
		}
		return false;
	}
	
	public static int maiorValor(int v[])
	{
		int maior=v[0];
		for (int i=1;i<v.length;i++)
		{
			if (v[i]>maior)
				maior=v[i];
		}
		return maior;
	}
	
	public static int menorValor(int v[])
	{
		int menor=v[0];
		for (int i=1;i<v.length;i++)
		{
			if (v[i]<menor)
				menor=v[i];
		}
		return menor;
	}
	
	public static float calcMedia(int v[])
	{
		float media=0;
		for (int i=1;i<v.length;i++)
		{
			media+=v[i];
		}
		return media/v.length;
	}
	
	public static void main(String[] args) {
		int op;
		int lista[] = new int[10];
		do
		{
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"1. Gerar vetor"
					+ "\n2. Imprimir"
					+ "\n3. Ordenar"
					+ "\n4. Buscar valor"
					+ "\n5. Maior valor"
					+ "\n6. Menor valor"
					+ "\n7. Média"
					+ "\n8. Sair"));
			
			switch (op)
			{
			case 1: geraVetor(lista);
					break;
			case 2: imprimeVetor(lista);
					break;
			case 3: ordenaVetor(lista);
					break;
			case 4: int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
					if (buscaVetor(lista, num))
						JOptionPane.showMessageDialog(null, num+" pertence ao vetor");
					else
						JOptionPane.showMessageDialog(null, num+" não pertence ao vetor");
					break;
			case 5: JOptionPane.showMessageDialog(null, "O maior valor é "+maiorValor(lista));
					break;
			case 6: JOptionPane.showMessageDialog(null, "O menor valor é "+menorValor(lista));
					break;
			case 7: JOptionPane.showMessageDialog(null, "A média é "+calcMedia(lista));
					break;
			case 8: JOptionPane.showMessageDialog(null, "Encerrando o programa!!");
					break;
			default:JOptionPane.showMessageDialog(null, "Opção inválida!!");
			
			}
		} while (op!=8);

	}

}
