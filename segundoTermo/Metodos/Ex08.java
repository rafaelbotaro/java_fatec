package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Ex08 {

	public static boolean primo(int n)
	{
		if (n<=1)
			return false;
		for (int i=2;i<=n/2;i++)
		{
			if (n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		if (primo(num))
			JOptionPane.showMessageDialog(null, "N�mero = "+num+" � primo");
		else
			JOptionPane.showMessageDialog(null, "N�mero = "+num+" n�o � primo");
	}
}
