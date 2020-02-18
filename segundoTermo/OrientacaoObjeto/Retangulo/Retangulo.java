package segundoTermo.OrientacaoObjeto.Retangulo;

public class Retangulo {
	
	public double base, altura;
	
	public Retangulo(double b, double a) {
		
		base = b;
		altura = a;
		
	}
	
	public String imprimeDados() {
		
		return "A base do retângulo é: "+base+ "\nA altura do retângulo é: "+altura;
		
	}
	
	public double calculaArea() {
		
		return base * altura;
		
	}
	
	public double calculaPerimetro() {
		
		return 2 * (base + altura);
		
	}

}