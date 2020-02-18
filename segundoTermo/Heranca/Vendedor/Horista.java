package segundoTermo.Heranca.Vendedor;

import javax.swing.JOptionPane;

public class Horista extends Empregado {
	
	private float valorHora, horasTrabalhadas;
	
	public Horista()
	{
		valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora: "));
		horasTrabalhadas = Float.parseFloat(JOptionPane.showInputDialog("Digite quantas horas trabalhadas: "));
	}
	
	public float valorSalario()
	{
		return valorHora * horasTrabalhadas;
	}
	
	public String imprimir()
	{
		return super.imprimir()
				+"\nValor da Hora: R$ "+valorHora
				+"\nHoras Trabalhadas: "+horasTrabalhadas
				+"\nSalário: R$ "+valorSalario();
	}

}
