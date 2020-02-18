package segundoTermo.OrientacaoObjeto.Retangulo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double base, altura;
		
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo"));

		Retangulo ret = new Retangulo(base, altura);
		JOptionPane.showMessageDialog(null, ret.imprimeDados() + "\nA área do retângulo é: "+ret.calculaArea()
				+ "\nO perímetro do retângulo é: "+ret.calculaPerimetro());
	}

}