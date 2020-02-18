package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void max(int a, int b)
	{
		if (a>b)
			JOptionPane.showMessageDialog(null, "O maior é "+a);
		else
			JOptionPane.showMessageDialog(null, "O maior é "+b);
	}
	
	public static void main(String[] args) {
		int n1, n2;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota 1"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota 2"));
		max(n1,n2);
	}

}

	