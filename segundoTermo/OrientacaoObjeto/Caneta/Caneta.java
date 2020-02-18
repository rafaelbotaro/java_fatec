package segundoTermo.OrientacaoObjeto.Caneta;

import javax.swing.JOptionPane;

public class Caneta {
	
	public String cor, marca;
	public double ponta;
	
	public Caneta()
	{
		marca = JOptionPane.showInputDialog("Informe a marca da caneta: ");
		cor = JOptionPane.showInputDialog("Informe a cor da caneta: ");
		ponta = Double.parseDouble(JOptionPane.showInputDialog("Informe a ponta da caneta: "));
	}
	
	public void imprimir()
	{
		JOptionPane.showMessageDialog(null, "Caneta: "+marca+"\nCor: "+cor+"\nPonta: "+ponta);
	}
	
	public void escrever()
	{
		JOptionPane.showMessageDialog(null, "Caneta escrevendo");
	}
	
}