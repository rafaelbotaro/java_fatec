package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void dobro() {
		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		JOptionPane.showMessageDialog(null, "O dobro de "+a+" � "+(2*a));
	}
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Teste antes da fun��o");
		dobro();
		JOptionPane.showMessageDialog(null, "Teste ap�s da fun��o");
	}

}
