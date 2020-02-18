package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Ex07 {

	public static int inverte(int n)
	{
		int inv=0;
		while (n!=0)
		{
			inv = inv*10 + n%10;
			n/=10;
		}
		return inv;
	}
	
	
	public static void main(String[] args) {
		int num, inv;
		num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		inv = inverte(num);
		JOptionPane.showMessageDialog(null, "Número = "+num+"\nInvertido = "+inv);
	}

}
