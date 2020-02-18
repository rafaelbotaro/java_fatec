package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class Ex09 {

	public static boolean primo(int n)
	{
		if (n==1) 
			return false;
		for (int i=2;i<=n/2;i++)
		{
			if (n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int inicio, fim, x, num;
		String listaPrimos="";
		inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o início do intervalo"));
		fim = Integer.parseInt(JOptionPane.showInputDialog("Informe o final do intervalo"));
		if (inicio>=fim)
		{
			x=inicio;
			inicio=fim;
			fim=x;
		}
		for (num=inicio;num<=fim;num++)
		{
			if (primo(num)==true)
				listaPrimos+=num+" ";
		}
		
		JOptionPane.showMessageDialog(null, "Números primos entre "+inicio+" e "+fim+"\n"+listaPrimos);

	}

}
