package segundoTermo.Heranca.Vendedor;

import javax.swing.JOptionPane;

public class Empregado {
	
	protected String numero, nome;
	
	public Empregado()
	{
		numero = JOptionPane.showInputDialog("Numero funcional");
		nome = JOptionPane.showInputDialog("Nome");
	}
	
	public String getNumero()
	{
		return numero;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String imprimir()
	{
		return "Nome: "+nome+"\nNúmero Funcional: "+numero;
	}

}