package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Exemplo04 {

	public static float calcMedia(float x, float y) {
		return (x+y)/2;
	}
	
	public static float maior(float x, float y) {
		if (x>y)
			return x;
		return y;
	}
	
	public static void main(String[] args) {
		float n1, n2, n3, media;
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 1� nota"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 2� nota"));
		media = calcMedia(n1, n2);
		if (media>6)
			JOptionPane.showMessageDialog(null, "Aprovado com a m�dia = "+media);
		else
		{
			n3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 3� nota"));
			media = calcMedia(n3, maior(n1,n2));
			if (media>6)
				JOptionPane.showMessageDialog(null, "Aprovado com a m�dia = "+media);
			else
				JOptionPane.showMessageDialog(null, "Reprovado com a m�dia = "+media);
		}
		
	}

}
