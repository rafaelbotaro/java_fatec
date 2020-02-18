package segundoTermo.Metodos;

import javax.swing.JOptionPane;

public class menu {
	
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
			binInverte += bin.charAt(i);
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
	
	public static void main(String[] args) {
		
		int op;
		
		do
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("1. Decimal para Binário" 
					+ "\n2. Binário para Decimal" 
					+ "\n3. Sair"));
			switch (op)
			{
			case 1: int decimal = Integer.parseInt(JOptionPane.showInputDialog("Informe o número em decimal: "));
			int d = decimalBin(decimal);
			JOptionPane.showMessageDialog(null, "O decimal "+decimal+ " convertido para binário é "+d);
				break;
				
			case 2: int binario = Integer.parseInt(JOptionPane.showInputDialog("Informe o número em binário: "));
			int b = binarioDec(binario);
			JOptionPane.showMessageDialog(null, "O binário "+binario+ " convertido para decimal é "+b);
				break;
			}
						
		}	while (op!=3);
		
	}

}