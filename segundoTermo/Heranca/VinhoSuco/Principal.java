package segundoTermo.Heranca.VinhoSuco;
		
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {		
		
		Vinho vinho[] = new Vinho[100];
		Suco suco[] = new Suco[100];
		int i, fim = 0;
		float maior = 0;
		boolean existe;
		String nomeVinho, sucoCaro = null;
		char op, opSub;
		
		do
		{
			op = JOptionPane.showInputDialog("1. Vinho\n2. Suco\n3. Finalizar").charAt(0);
			switch (op)
			{
			case '1': do
					  {
							opSub = JOptionPane.showInputDialog
									("A. Cadastrar vinho"
									+ "\nB. Listar vinhos"
									+ "\nC. Consultar preço"
									+ "\nD. Voltar ao Menu Principal").toUpperCase().charAt(0);
							
							switch (opSub)
							{
							case 'A': if (fim == 100)
											JOptionPane.showMessageDialog(null, "Impossível cadastrar novo vinho.");
										  else
										  {
											  vinho[fim++] = new Vinho();
											  JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
										   }
										  break;
									  
							case 'B': for (i = 0; i < fim; i++)
										  	JOptionPane.showMessageDialog(null, vinho[i].imprimir());
										  break;
									  
							case 'C': nomeVinho = JOptionPane.showInputDialog("Informe o nome do vinho:");
											existe = false;
											for (i = 0; i < fim; i++)
											{
												if (vinho[i].nome.equals(nomeVinho))
												{
													JOptionPane.showMessageDialog(null, vinho[i].imprimir());
													existe = true;
													break;
												}
											}
											if (!existe)
												JOptionPane.showMessageDialog(null, "Vinho não cadastrado.");
											break;
							}
				
					  } while (opSub!='D');
					  	break;
					  
			case '2': do
					  	{
							opSub = JOptionPane.showInputDialog
									("A. Cadastrar suco"
									+ "\nB. Listar sucos"
									+ "\nC. Mais Caro"
									+ "\nD. Voltar ao Menu Principal").toUpperCase().charAt(0);
							
							switch (opSub)
							{
							case 'A': if (fim == 100)
											JOptionPane.showMessageDialog(null, "Impossível cadastrar novo suco.");
										  else
										  {
											suco[fim++] = new Suco();
											JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
										  }
										  break;
									  
							case 'B': for (i = 0; i < fim; i++)
							  			  	JOptionPane.showMessageDialog(null, suco[i].imprimir());
							 			  break;
									  
							case 'C': for (i = 0; i < fim; i++)
											{
												if (suco[i].preco > maior)
													sucoCaro = suco[i].nome;
											}
											JOptionPane.showMessageDialog(null, "O suco mais caro é: "+sucoCaro);
							}
			
					  } while (opSub!='D');
					  	break;
				
			}
			
		} while (op!='3');
	
	}

}