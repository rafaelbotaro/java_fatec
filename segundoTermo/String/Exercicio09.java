package segundoTermo.String;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {

		String lista[] = new String[5], nomes = "", aux = "";
		int i, j;

		for (i = 0; i < 5; i++) {
			lista[i] = JOptionPane.showInputDialog("Informe um nome");
			nomes += lista[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, nomes);

		// BubbleSort

		for (i = 0; i < 5; i++) {
			for (j = i + 1; j < 5; j++) {
				if (lista[i].compareTo(lista[j]) > 0) {
					aux = lista[i];
					lista[i] = lista[j];
					lista[j] = aux;
				}
			}
		}

		nomes = "";
		for (i = 0; i < 5; i++) {
			nomes += lista[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, nomes);

	}

}
