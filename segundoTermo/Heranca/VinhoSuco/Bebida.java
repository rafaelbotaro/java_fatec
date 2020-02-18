package segundoTermo.Heranca.VinhoSuco;

import javax.swing.JOptionPane;

public class Bebida {
	
	protected String nome;
	protected double preco;
	
	public Bebida()
	{
		nome = JOptionPane.showInputDialog("Informe o nome da bebida");
		preco = Double.parseDouble(JOptionPane.showInputDialog("Nome"));
	}
	
	public String getNome()
	{
		return nome;
	}

	public double getPreco()
	{
		return preco;
	}
	
	public String imprimir()
	{
		return "Nome: "+nome+"\nPreço: "+preco;
	}
	
}