package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio2 {
	
	public static float divisao(float a, float b){
		
		return (a / b);
		
	}

	public static void main(String[] args) {
		
		float a = Float.parseFloat(JOptionPane.showInputDialog("Digite um n�mero: "));
		float b = Float.parseFloat(JOptionPane.showInputDialog("Digite um n�mero: "));
		JOptionPane.showMessageDialog(null, "Resultado da divis�o: "+divisao(a,b));

	}

}