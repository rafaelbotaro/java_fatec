package segundoTermo.OrientacaoObjeto.Veiculo;

public class Veiculo {
	
	public String modelo, marca, ano;
	
	public Veiculo(String mod, String mar, String an) {
		
		modelo = mod;
		marca = mar;
		ano = an;
		
	}
		
	public String imprimir() {
			
		return "Modelo: "+modelo+ "\nMarca: "+marca+"\nAno: "+ano;
			
	}
	
	public int calcularIdade(int anoAtual) {
		
		int anoConvertido = Integer.parseInt(ano);
		return anoAtual - anoConvertido;
			
	}

}