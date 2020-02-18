package segundoTermo.String;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exercicio09UtilizandoMetodos {
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		String lista[] = new String[5], nomes = "", aux = "";
		int i;

		for (i = 0; i < 5; i++) {
			lista[i] = JOptionPane.showInputDialog("Informe um nome");
		}
		JOptionPane.showMessageDialog(null, Arrays.toString(lista));

		Arrays.sort(lista);

		JOptionPane.showMessageDialog(null, Arrays.toString(lista));

	}
	
}
