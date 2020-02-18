package segundoTermo.OrientacaoObjeto.Animal;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome, especie, raca;
		
		nome = JOptionPane.showInputDialog("Digite o nome do cachorro");
		especie = JOptionPane.showInputDialog("Digite a espécie do cachorro");
		raca = JOptionPane.showInputDialog("Digite a raça do cachorro");
		
		Animal cachorro = new Animal(nome, especie, raca);
		JOptionPane.showMessageDialog(null, cachorro.imprimir());
		
	}

}