package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio1 {
		
	public static int parImpar(int numero) {
			
		return (numero % 2);
			
		}
	
		public static void main(String[] args) {			
	
			int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
			
			if (parImpar (a) == 0)
				JOptionPane.showMessageDialog(null, "O n�mero � PAR.");
			else
				JOptionPane.showMessageDialog(null, "O n�mero � IMPAR.");

	}

}