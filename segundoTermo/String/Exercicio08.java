package segundoTermo.String;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		String palavra;
		int tam;
		palavra = JOptionPane.showInputDialog("Informe uma palavra");
		tam = palavra.length();
		
		if (tam%2==1)  
			JOptionPane.showMessageDialog(null, palavra+"\n"+palavra.charAt(tam/2));
		else 
			JOptionPane.showMessageDialog(null, palavra+"\n"+palavra.charAt(tam/2-1) 
					+""+ palavra.charAt(tam/2));
		
	}

}
