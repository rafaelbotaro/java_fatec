package segundoTermo.OrientacaoObjeto.Banco;

import javax.swing.JOptionPane;

public class Conta {
	
	public String nome, numero;
	public float saldo;
	
	public Conta() 
	{
		numero = JOptionPane.showInputDialog("Informe o número da conta: ");
		nome = JOptionPane.showInputDialog("Informe o nome do correntista: ");
		saldo = 0;
	}
	
	public String listar() 
	{
		return "Cliente: "+nome+ "\nConta Corrente n° "+numero+"\nSaldo: R$ "+saldo;
	}
	
	public void depositar(float valor)
	{
		saldo += valor;
	}
	
	public boolean retirar(float valor)
	{
		if (valor > saldo)
			return false;
		saldo -= valor;
		return true;
	}

}