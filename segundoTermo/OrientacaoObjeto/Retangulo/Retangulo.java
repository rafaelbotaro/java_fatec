package segundoTermo.OrientacaoObjeto.Retangulo;

public class Retangulo {
	
	public double base, altura;
	
	public Retangulo(double b, double a) {
		
		base = b;
		altura = a;
		
	}
	
	public String imprimeDados() {
		
		return "A base do ret�ngulo �: "+base+ "\nA altura do ret�ngulo �: "+altura;
		
	}
	
	public double calculaArea() {
		
		return base * altura;
		
	}
	
	public double calculaPerimetro() {
		
		return 2 * (base + altura);
		
	}

}