package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio8 {
	
	public static boolean primo(int n) {
		
		if (n <= 1)
			return false;
		for (int i = 2; i <= n / 2; i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main (String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero: "));
		
		if (primo(num))
			JOptionPane.showMessageDialog(null, "O n�mero "+num+" � primo.");
		else
			JOptionPane.showMessageDialog(null, "O n�mero "+num+" n�o � primo.");
		
	}

}