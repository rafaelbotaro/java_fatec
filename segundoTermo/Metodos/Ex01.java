package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void paridade() {
		
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		
		if (num%2==0)
			JOptionPane.showMessageDialog(null, num+" � par");
		else
			JOptionPane.showMessageDialog(null, num+" � �mpar");
	}
	
	public static void main(String[] args) {
		paridade();
	}

}
