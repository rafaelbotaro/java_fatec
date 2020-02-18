package segundoTermo.OrientacaoObjeto.Calculadora;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;

		opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha sua opção:"
				+ "\n\n1. Soma"
				+ "\n2. Subtração"
				+ "\n3. Multiplicação"
				+ "\n4. Divisão\n\n"));
			
		switch (opcao)
		{
		case 1: adicao();
				break;
					
		case 2: subtr();
				break;
					
		case 3: mult();
				break;
			
		case 4: div();
				break;
			
		default: JOptionPane.showMessageDialog(null, "Fim do Programa.");
		}

	}

	private static void adicao() 
	{
		double valor1, valor2, resultado;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		resultado = valor1 + valor2;
		
		JOptionPane.showMessageDialog(null, +valor1+" + "+valor2+" é igual a "+resultado);	
	}
	
	private static void subtr() 
	{
		double valor1, valor2, resultado;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		resultado = valor1 - valor2;
		
		JOptionPane.showMessageDialog(null, +valor1+" - "+valor2+" é igual a "+resultado);
	}
	
	private static void mult() 
	{
		double valor1, valor2, resultado;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		resultado = valor1 * valor2;
		
		JOptionPane.showMessageDialog(null, valor1+" x "+valor2+" é igual a "+resultado);	
	}

	private static void div() 
	{
		double valor1, valor2, resultado;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		resultado = valor1 / valor2;
		
		JOptionPane.showMessageDialog(null, +valor1+" / "+valor2+" é igual a "+resultado);
	}

}