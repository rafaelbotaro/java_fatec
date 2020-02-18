package segundoTermo.Provas.n2IITermo;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {

		Remedio remedio[] = new Remedio[50];
		int op, i, fim = 0;
		float porcentagem;
		
		do
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("1. Cadastrar"
					+ "\n2. Listar"
					+ "\n3. Listar com aumento"
					+ "\n4. Encerrar"));
			
			switch (op)
			{
			case 1: if (fim == 50)
							JOptionPane.showMessageDialog(null, "Impossível cadastrar novo remédio.");
						else
						{
							remedio [fim++] = new Remedio();
							JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.");
						}
						break;
			
			case 2: for (i = 0; i < fim; i++)
							JOptionPane.showMessageDialog(null, remedio[i].imprimir());
						break;
				
			case 3:  porcentagem = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem do aumento"));
						for (i = 0; i < fim; i++)
						{
							remedio[i].calcularAumento(porcentagem);
							JOptionPane.showMessageDialog(null, remedio[i].imprimir());	
						}
							
			}
			
		} while (op != 4);

	}

}