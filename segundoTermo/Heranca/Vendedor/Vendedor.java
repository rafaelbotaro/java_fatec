package segundoTermo.Heranca.Vendedor;

import javax.swing.JOptionPane;

public class Vendedor extends Empregado {
	
	private float salarioBase, valorVendasMes, percentualComissao;
	
	public Vendedor()
	{
		salarioBase = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário base: "));
		valorVendasMes = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de vendas do mês: "));
		percentualComissao = Float.parseFloat(JOptionPane.showInputDialog("Digite o percentual de comissão: "));
	}
	
	public float valorSalario()
	{
		return salarioBase + valorVendasMes*(percentualComissao/100);
	}
	
	public String imprimir()
	{
		return super.imprimir()
				+"\nSalário Base: R$ "+salarioBase
				+"\nVendas no mês: "+valorVendasMes
				+"\nComissão (%): "+percentualComissao
				+"\nSalário: R$ "+valorSalario();
	}
	
}