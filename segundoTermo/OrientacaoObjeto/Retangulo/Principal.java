package segundoTermo.OrientacaoObjeto.Retangulo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double base, altura;
		
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do ret�ngulo"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do ret�ngulo"));

		Retangulo ret = new Retangulo(base, altura);
		JOptionPane.showMessageDialog(null, ret.imprimeDados() + "\nA �rea do ret�ngulo �: "+ret.calculaArea()
				+ "\nO per�metro do ret�ngulo �: "+ret.calculaPerimetro());
	}

}