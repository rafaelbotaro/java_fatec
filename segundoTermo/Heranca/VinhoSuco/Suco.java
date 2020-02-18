package segundoTermo.Heranca.VinhoSuco;

import javax.swing.JOptionPane;

public class Suco extends  Bebida {
	
	protected String sabor;
	
	public Suco()
	{
		sabor = JOptionPane.showInputDialog("Informe o sabor do suco");
	}
	
	public String getSabor()
	{
		return sabor;
	}
	
	public String imprimir()
	{
		return super.imprimir()+"Sabor: "+sabor;
	}
	
}