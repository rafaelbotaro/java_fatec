package segundoTermo.OrientacaoObjeto.Veiculo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String modelo, marca, ano;
		
		modelo = JOptionPane.showInputDialog("Digite o modelo do veículo");
		marca = JOptionPane.showInputDialog("Digite a marca do veículo");
		ano = JOptionPane.showInputDialog("Digite o ano do veículo");
		
		Veiculo veiculo = new Veiculo(modelo, marca, ano);
		
		JOptionPane.showMessageDialog(null, veiculo.imprimir());
		JOptionPane.showMessageDialog(null, "O "+modelo+" tem "+veiculo.calcularIdade(2019)+" anos.");

	}
	
}