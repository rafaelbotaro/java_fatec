package segundoTermo.OrientacaoObjeto.Calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

	public double valor1, valor2, resultado;
	
	public void adicao()
	{
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		resultado = valor1 + valor2;
		
		JOptionPane.showMessageDialog(null, "Soma = "+resultado);
	}
	
	public void subtr()
	{
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		resultado = valor1 - valor2;
		
		JOptionPane.showMessageDialog(null, "Subtra��o = "+resultado);
	}
	
	public void mult()
	{
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		resultado = valor1 * valor2;
		
		JOptionPane.showMessageDialog(null, "Multiplica��o = "+resultado);
	}
	
	public void div()
	{
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		resultado = valor1 / valor2;
		
		JOptionPane.showMessageDialog(null, "Divis�o = "+resultado);
	}
	
}