package segundoTermo.OrientacaoObjeto.Banco;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Conta carteira[] = new Conta[100];
		int i, fim = 0, op;
		float val;
		String cc;
		boolean existe;
		
		do 
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("1. Cadastrar"
					+ "\n2. Depositar"
					+ "\n3. Retirar"
					+ "\n4. Listar"
					+ "\n5. Sair"));
			
			switch (op)
			{
			case 1: if (fim == 100)
						JOptionPane.showMessageDialog(null, "Impossível cadastrar mais contas.");
					else
					{
						carteira [fim++] = new Conta();
						JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
					}
					break;
			
			case 2: cc = JOptionPane.showInputDialog("Informe a conta para depósito: ");
					val = Float.parseFloat(JOptionPane.showInputDialog("Valor do depósito R$ "));
					existe = false;
					for (i = 0; i < fim; i++)
					{
						if (carteira[i].numero.equals(cc))
						{
							carteira[i].depositar(val);
							JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso!");
							existe = true;
							break;
						}
					}
					if (!existe)
						JOptionPane.showMessageDialog(null, "Conta não cadastrada");
					break;
					
			case 3: cc = JOptionPane.showInputDialog("Informe a conta para retirada: ");
					val = Float.parseFloat(JOptionPane.showInputDialog("Valor do saque R$ "));
					existe = false;
					for (i = 0; i < fim; i++)
					{
						if (carteira[i].numero.equals(cc))
						{
							if (carteira[i].retirar(val))
							{
								JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso!\n Seu saldo é R$"
										+carteira[i].saldo);
								existe = true;
								break;
							}
							else 
							{
								JOptionPane.showMessageDialog(null, "Saldo insuficiente. R$"+carteira[i].saldo
										+"\nDigite outro valor.");
								existe = true;
								break;
							}
						}
					}	
					if (!existe)
						JOptionPane.showMessageDialog(null, "Conta não cadastrada");
					break;	
					
			case 4: for (i = 0; i < fim; i++)
					JOptionPane.showMessageDialog(null, carteira[i].listar());
			}

		} while (op != 5);
	
	}
	
}