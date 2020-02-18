package segundoTermo.OrientacaoObjeto.Animal;

public class Animal {
	
	public String nome, especie, raca;
	
	public Animal(String n, String e, String r) {
		
		nome = n;
		especie = e;
		raca = r;
		
	}
	
	public String imprimir() {
		
		return nome+"\n\nEspécie: "+especie+"\nRaça: "+raca;
	
	}

}