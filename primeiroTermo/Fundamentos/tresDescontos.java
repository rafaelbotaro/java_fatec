package primeiroTermo.Fundamentos;
import java.util.Scanner;

public class tresDescontos {
	
	public static void main (String[] args) {
		
		float vc, vd, vp;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print ("Digite o valor da sua compra: R$ ");
		vc = leia.nextFloat ();
		System.out.println ();
		
		if (vc >= 500)
			vd = vc * 0.25f;
		else
			if (vc >= 200)
				vd = vc * 0.20f;
			else
				vd = vc * 0.10f;
		
		vp = vc - vd;
		
		System.out.println ("Valor da compra: R$ "+vc);
		System.out.println ("Valor do desconto: R$ "+vd);
		System.out.println ("Valor a pagar: R$ "+vp);
		leia.close();
		
	}

}