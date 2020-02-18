package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio2 {
	
	public static float divisao(float a, float b){
		
		return (a / b);
		
	}

	public static void main(String[] args) {
		
		float a = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
		float b = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
		JOptionPane.showMessageDialog(null, "Resultado da divisão: "+divisao(a,b));

	}

}