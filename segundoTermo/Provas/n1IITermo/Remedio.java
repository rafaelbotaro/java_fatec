package segundoTermo.Provas.n1IITermo;

import javax.swing.JOptionPane;

public class Remedio {

	public String nome, laboratorio;
	public int quantidade;
	public float preco;
	
	public Remedio()
	{
		nome = JOptionPane.showInputDialog("Digite o nome do remédio:");
		laboratorio = JOptionPane.showInputDialog("Digite o laboratório do remédio:");
		preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do remédio:"));
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desse remédio:"));
	}
	
	public String imprimir()
	{
		return "Remédio: "+nome+"\nLaboratório: "+laboratorio+"\nQuantidade: "+quantidade+"\nPreço: "+preco;
	}
}