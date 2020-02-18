package segundoTermo.Provas.n2IITermo;

import javax.swing.JOptionPane;

public class Remedio {
	
	private String descricao, laboratorio;
	private float valor;
	
	public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

	public Remedio()
	{
		descricao = JOptionPane.showInputDialog("Digite a descrição do remédio:");
		laboratorio = JOptionPane.showInputDialog("Digite o laboratório do remédio:");
		valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do remédio:"));
	}
	
	public String imprimir()
	{
		return "Descrição: "+descricao+"\nLaboratório: "+laboratorio+"\nValor: "+valor;
	}
	
	public float calcularAumento(float aumento)
	{
		this.valor = valor  * aumento / 100 + valor;
		return valor;
	}

}