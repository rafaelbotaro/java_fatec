package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void soma(int a, int b) {
		JOptionPane.showMessageDialog(null, a+b);
	}
	
	public static void main(String[] args) {
		soma(6,7);
		soma(8,12);
		int x = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		soma(x,6);
		
	}

}
