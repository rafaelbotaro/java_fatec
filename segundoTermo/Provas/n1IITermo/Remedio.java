package segundoTermo.Provas.n1IITermo;

import javax.swing.JOptionPane;

public class Remedio {

	public String nome, laboratorio;
	public int quantidade;
	public float preco;
	
	public Remedio()
	{
		nome = JOptionPane.showInputDialog("Digite o nome do rem�dio:");
		laboratorio = JOptionPane.showInputDialog("Digite o laborat�rio do rem�dio:");
		preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o pre�o do rem�dio:"));
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desse rem�dio:"));
	}
	
	public String imprimir()
	{
		return "Rem�dio: "+nome+"\nLaborat�rio: "+laboratorio+"\nQuantidade: "+quantidade+"\nPre�o: "+preco;
	}
}