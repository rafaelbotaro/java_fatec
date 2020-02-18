package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void paridade() {
		
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		
		if (num%2==0)
			JOptionPane.showMessageDialog(null, num+" é par");
		else
			JOptionPane.showMessageDialog(null, num+" é ímpar");
	}
	
	public static void main(String[] args) {
		paridade();
	}

}
