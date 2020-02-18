package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Ex06 {

	public static int potencia(int b, int e)
	{
		int pot=1;
		for (int i=1;i<=e;i++)
		{
			pot*=b;
		}
		return pot;
	}
	
	public static void main(String[] args) {
		int base, exp, p;
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base"));
		exp  = Integer.parseInt(JOptionPane.showInputDialog("Informe o expoente"));
		p=potencia(base,exp);
		JOptionPane.showMessageDialog(null, base+" elevado a "+exp+" = "+p);

	}

}
