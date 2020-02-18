package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Exemplo03 {

	public static int soma(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,soma(6,7));
		JOptionPane.showMessageDialog(null,soma(8,12));
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		JOptionPane.showMessageDialog(null,soma(x,6));
		if (soma(5,15) % 5==0)
			JOptionPane.showMessageDialog(null, "Resultado múltiplo de 5");
		else
			JOptionPane.showMessageDialog(null, "Resultado não múltiplo de 5");
			
	}

}
