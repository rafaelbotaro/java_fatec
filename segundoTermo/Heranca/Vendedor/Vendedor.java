package segundoTermo.Heranca.Vendedor;

import javax.swing.JOptionPane;

public class Vendedor extends Empregado {
	
	private float salarioBase, valorVendasMes, percentualComissao;
	
	public Vendedor()
	{
		salarioBase = Float.parseFloat(JOptionPane.showInputDialog("Digite o sal�rio base: "));
		valorVendasMes = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de vendas do m�s: "));
		percentualComissao = Float.parseFloat(JOptionPane.showInputDialog("Digite o percentual de comiss�o: "));
	}
	
	public float valorSalario()
	{
		return salarioBase + valorVendasMes*(percentualComissao/100);
	}
	
	public String imprimir()
	{
		return super.imprimir()
				+"\nSal�rio Base: R$ "+salarioBase
				+"\nVendas no m�s: "+valorVendasMes
				+"\nComiss�o (%): "+percentualComissao
				+"\nSal�rio: R$ "+valorSalario();
	}
	
}