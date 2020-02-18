package segundoTermo.Provas.n1IITermo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Remedio med[] = new Remedio[50];
		int op, i, fim = 0;
		float maior = 0;
		String nomeRemedio, remedioCaro = null;
		boolean existe;
		
		do
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("1. Cadastrar"
					+ "\n2. Listar"
					+ "\n3. Consultar"
					+ "\n4. Mostrar o remédio mais caro"
					+ "\n5. Encerrar"));
			
			switch (op)
			{
			case 1: if (fim == 50)
							JOptionPane.showMessageDialog(null, "Impossível cadastrar novo remédio.");
						else
						{
							med [fim++] = new Remedio();
							JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.");
						}
						break;
			
			case 2: for (i = 0; i < fim; i++)
							JOptionPane.showMessageDialog(null, med[i].imprimir());
						break;
				
			case 3: nomeRemedio = JOptionPane.showInputDialog("Informe o nome do remédio:");
						existe = false;
						for (i = 0; i < fim; i++)
						{
							if (med[i].nome.equals(nomeRemedio))
							{
								JOptionPane.showMessageDialog(null, med[i].imprimir());
								existe = true;
								break;
							}
						}
						if (!existe)
							JOptionPane.showMessageDialog(null, "Remédio não cadastrado.");
						break;
					
			case 4: for (i = 0; i < fim; i++)
						{
							if (med[i].preco > maior)
								remedioCaro = med[i].nome;
								maior = med[i].preco;
						}
						JOptionPane.showMessageDialog(null, "Remédio mais caro: "+remedioCaro+"\nValor: R$ "+maior+" reais");
			}
			
		} while (op != 5);

	}

}