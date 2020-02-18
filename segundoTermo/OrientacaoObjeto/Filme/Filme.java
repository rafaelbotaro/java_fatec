package segundoTermo.OrientacaoObjeto.Filme;

import javax.swing.JOptionPane;

public class Filme {
	
	public int tempo, anoLancamento;
	public String titulo, avaliacao, resumo;
	public boolean visto;
	
	public Filme() 
	{
		titulo = JOptionPane.showInputDialog("Digite o título do filme");
		
		if (JOptionPane.showConfirmDialog(null, "Você assistiu ao filme?",
				"Cadastro de Filme", JOptionPane.YES_NO_OPTION) == 0)
		{
			visto = true;
			resumo = JOptionPane.showInputDialog("Informe o resumo do filme");
			avaliacao = JOptionPane.showInputDialog("Digite sua avaliação sobre o filme");
		}
		else
		{
			visto = false;
			resumo = "Sem resumo";
			avaliacao = "Sem avaliação";
		}
		
		tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de filme em minutos"));
		anoLancamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de lançamento"));
	}
	
	public String imprimir() 
	{
		return "Filme: "+titulo+ "\nAvaliação: "+avaliacao+"\nResumo: "+resumo
				+ "\nTempo do filme: "+tempo+"\nAno de Lançamento: "+anoLancamento;
	}
	
	public void assistir()
	{	
			visto = true;
			resumo = JOptionPane.showInputDialog("Informe o resumo do filme");
			avaliacao = JOptionPane.showInputDialog("Digite sua avaliação sobre o filme");
		
	}

}