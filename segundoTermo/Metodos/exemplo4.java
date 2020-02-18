package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exemplo4 {
	
	public static float calcMedia (float x, float y) {
		return (x + y) / 2;
	}
	
	
	public static float maior (float x, float y) {
			if (x > y)
				return x;
			return y;
		}

	
	public static void main(String[] args) {
		
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 1a. nota: "));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 2a. nota: "));
		float media = calcMedia(n1, n2);
		
		if (media > 6)
			JOptionPane.showMessageDialog(null, "Aprovado com média "+media);
		else
		{
			float n3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 3a. nota: "));
			media = calcMedia(n3, maior(n1, n2));
			if (media > 6)
				JOptionPane.showMessageDialog(null, "Aluno aprovado com média "+media);
			else
				JOptionPane.showMessageDialog(null, "Aluno reprovado com média "+media);
		}
		
	}

}