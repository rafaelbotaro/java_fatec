package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Ex05 {

	public static int max(int a, int b)
	{
		if (a>b)
			return a;
		return b;
	}
	
	public static void main(String[] args) {
		int n1, n2, maior;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota 1"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota 2"));
		maior = max(n1,n2);
		JOptionPane.showMessageDialog(null, "O maior é "+maior);
	}
}
