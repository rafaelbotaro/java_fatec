package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void dobro() {
		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		JOptionPane.showMessageDialog(null, "O dobro de "+a+" é "+(2*a));
	}
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Teste antes da função");
		dobro();
		JOptionPane.showMessageDialog(null, "Teste após da função");
	}

}
