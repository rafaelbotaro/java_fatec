package segundoTermo.Trabalhos;

import javax.swing.JOptionPane;

public class RafaelBotaroBases {
	
	public static int decimalBin(int dec) {
		
		String bin = "";
		
		while (dec != 0)
		{
			bin += dec % 2;
			dec /= 2;			
		}
		
		String binInverte = "";
		
		for (int i = bin.length()-1; i >= 0; i--)
		{
			binInverte+=bin.charAt(i);
		}
		
		return Integer.parseInt(binInverte);
		
	}
	
	public static int binarioDec(int bin) {
		
		int dec = 0;
		int exp = 0;
		
		while (bin != 0)
		{
			dec += bin % 10 * Math.pow(2, exp);
			bin /= 10;
			exp++;
		}
		return dec;
	}
	
	public static boolean verifica(String binario) {
		
		int i;
			
		for (i = 0; i < binario.length(); i++)
		{
			if (binario.charAt(i) != '0' && binario.charAt(i) != '1')
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int op;
		
		do
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("1. Decimal para Bin�rio" 
					+ "\n2. Bin�rio para Decimal" 
					+ "\n3. Sair"));
			
			switch (op)
			{
			case 1: int decimal = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero em decimal: "));
			int d = decimalBin(decimal);
			JOptionPane.showMessageDialog(null, "O decimal "+decimal+ " convertido para bin�rio � "+d);
				break;
				
			case 2: String binario = JOptionPane.showInputDialog("Informe o n�mero em bin�rio: ");
			if (verifica(binario))
			{
				int b = binarioDec(Integer.parseInt(binario));
				JOptionPane.showMessageDialog(null, "O bin�rio "+binario+ " convertido para decimal � "+b);
			}
			else
				JOptionPane.showMessageDialog(null, "O n�mero digitado n�o � bin�rio.");
				break;
			}
						
		}	while (op != 3);
		
	}

}