package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class exercicio9 {
	
	public static boolean primo(int num) {
		
		if (num == 1) 
			return false;
		for (int i = 2; i <= num / 2; i++)
		{
			if (num % i == 0)
				return false;
		}
		return true;		
	}
	
	public static void main (String[] args) {
		
		int num, x;
		String listaPrimos = "";
		
		int inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o início do intervalo: "));
		int fim = Integer.parseInt(JOptionPane.showInputDialog("Informe o final do intervalo: "));
		
		if (inicio >= fim)
		{
			x = inicio;
			inicio = fim;
			fim = x;
		}
		
		for (num = inicio; num <= fim; num++)
		{
			if (primo(num) == true)
				listaPrimos += num+" ";
		}

		JOptionPane.showMessageDialog(null, "Os numeros primos entre "+inicio+" e "+fim+" são: "+listaPrimos);
		
	}

}