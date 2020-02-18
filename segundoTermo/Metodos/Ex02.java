package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Ex02 {

	
	public static void divisao() {
		float a, b, div;
		a = Float.parseFloat(JOptionPane.showInputDialog("Informe o numerador"));
		b = Float.parseFloat(JOptionPane.showInputDialog("Informe o denominador"));
		if (b==0)
			JOptionPane.showMessageDialog(null, "Não existe divisão por ZERO");
		else
		{
			div = a/b;
			JOptionPane.showMessageDialog(null, a+" / "+b+" = "+div);
		}
		
	}
	
	public static void main(String[] args) {
		divisao();
	}

}
