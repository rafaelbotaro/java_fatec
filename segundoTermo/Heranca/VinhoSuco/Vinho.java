package segundoTermo.Heranca.VinhoSuco;

import javax.swing.JOptionPane;

public class Vinho extends Bebida {
	
	protected String tipo;
	protected int anoSafra;
	
	public Vinho()
	{
		tipo = JOptionPane.showInputDialog("Informe o tipo do vinho");
		anoSafra = Integer.parseInt(JOptionPane.showInputDialog("Nome"));
	}
	
	public String getTipo()
	{
		return tipo;
	}
	
	public int getSafra()
	{
		return anoSafra;
	}
	
	public String imprimir()
	{
		return super.imprimir()+"\nSafra (ano): "+anoSafra+"\nTipo: "+tipo;
	}
	
}