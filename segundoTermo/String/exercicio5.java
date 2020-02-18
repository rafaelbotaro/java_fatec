package segundoTermo.String;

import javax.swing.JOptionPane;

public class exercicio5 {

	public static void main(String[] args) {
		
		int cont = 0; 

		String frase = JOptionPane.showInputDialog("Digite uma frase: ").toLowerCase();
		
		for (int i = 0; i < frase.length(); i++)
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' 
			|| frase.charAt(i) == 'o' || frase.charAt(i) == 'u') cont++;
				
			JOptionPane.showMessageDialog(null, "A quantidade de vogais da frase é "+cont);

	}

}