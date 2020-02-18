package segundoTermo.Heranca.Vendedor;

import javax.swing.JOptionPane;

public class Gerente extends Empregado {
	
	private float salarioMensal;
	
	public Gerente()
	{
		salarioMensal = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário mensal: "));
	}
	
	public float valorSalario()
	{
		return salarioMensal;
	}
	
	public String imprimir()
	{
		return super.imprimir()
				+"\nSalário R$: "+salarioMensal;
	}

}