package segundoTermo.OrientacaoObjeto.Filme;

import javax.swing.JOptionPane;

public class Filme {
	
	public int tempo, anoLancamento;
	public String titulo, avaliacao, resumo;
	public boolean visto;
	
	public Filme() 
	{
		titulo = JOptionPane.showInputDialog("Digite o t�tulo do filme");
		
		if (JOptionPane.showConfirmDialog(null, "Voc� assistiu ao filme?",
				"Cadastro de Filme", JOptionPane.YES_NO_OPTION) == 0)
		{
			visto = true;
			resumo = JOptionPane.showInputDialog("Informe o resumo do filme");
			avaliacao = JOptionPane.showInputDialog("Digite sua avalia��o sobre o filme");
		}
		else
		{
			visto = false;
			resumo = "Sem resumo";
			avaliacao = "Sem avalia��o";
		}
		
		tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de filme em minutos"));
		anoLancamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de lan�amento"));
	}
	
	public String imprimir() 
	{
		return "Filme: "+titulo+ "\nAvalia��o: "+avaliacao+"\nResumo: "+resumo
				+ "\nTempo do filme: "+tempo+"\nAno de Lan�amento: "+anoLancamento;
	}
	
	public void assistir()
	{	
			visto = true;
			resumo = JOptionPane.showInputDialog("Informe o resumo do filme");
			avaliacao = JOptionPane.showInputDialog("Digite sua avalia��o sobre o filme");
		
	}

}