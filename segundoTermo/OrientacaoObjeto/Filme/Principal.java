package segundoTermo.OrientacaoObjeto.Filme;

import javax.swing.JOptionPane;

import segundoTermo.OrientacaoObjeto.Filme.Filme;

public class Principal {

	public static void main(String[] args) {

		Filme movie[] = new Filme[50];
		int i, fim = 0, op;
		String titul;
		boolean existe;
		
		do 
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("1. Cadastrar"
					+ "\n2. Listar"
					+ "\n3. Consultar"
					+ "\n4. Assistir"
					+ "\n5. Filmes Assistidos"
					+ "\n6. Filmes não assistidos"
					+ "\n7. Sair"));
			
			switch (op)
			{
			case 1: if (fim == 50)
							JOptionPane.showMessageDialog(null, "Impossível cadastrar novo filme.");
						else
						{
							movie [fim++] = new Filme();
							JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
						}
						break;
			
			case 2: for (i = 0; i < fim; i++)
							JOptionPane.showMessageDialog(null, movie[i].imprimir());
						break;
			
			case 3: titul = JOptionPane.showInputDialog("Informe o título do filme");
									existe = false;
									for (i = 0; i < fim; i++)
									{
										if (movie[i].titulo.equals(titul))
										{
											JOptionPane.showMessageDialog(null, movie[i].imprimir());
											existe = true;
											break;
										}													
									}
									if (!existe)
										JOptionPane.showMessageDialog(null, "Filme não cadastrado");
									break;
			
			case 4: titul = JOptionPane.showInputDialog("Informe o título do filme");
									existe = false;
									for (i = 0; i < fim; i++)
									{
										if (movie[i].titulo.equals(titul))
										{
											movie[i].assistir();
											existe = true;
											break;
										}													
									}
									if (!existe)
										JOptionPane.showMessageDialog(null, "Filme não cadastrado");
									break;
				
			case 5: for (i = 0; i < fim; i++)
						{
							if (movie[i].visto)
								JOptionPane.showMessageDialog(null, movie[i].imprimir());
						}
						break;
			
			case 6: for (i = 0; i < fim; i++)
						{
							if (!movie[i].visto)
								JOptionPane.showMessageDialog(null, movie[i].imprimir());
						}
			
			}
			
		} while (op != 7);
		
	}
	
}