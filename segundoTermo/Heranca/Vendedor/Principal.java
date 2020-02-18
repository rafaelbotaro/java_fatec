package segundoTermo.Heranca.Vendedor;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		Vendedor e1 = new Vendedor();
		Gerente e2 = new Gerente();
		Horista e3 = new Horista();
		
		float s1, s2, s3;
		s1 = e1.valorSalario();
		s2 = e2.valorSalario();
		s3 = e3.valorSalario();
		
		JOptionPane.showMessageDialog(null, "Vendedor\n"+e1.imprimir()
																+"\nGerente\n"+e2.imprimir()
																+"\nHorista\n"+e3.imprimir());
		
		if (s1>s2 && s1>s3)
			JOptionPane.showMessageDialog(null, "\nO vendedor "+e1.getNome()+" tem o maior salário R$ "+s1);
		else	if (s2>s3)
			JOptionPane.showMessageDialog(null, "\nO gerente "+e2.getNome()+" tem o maior salário R$ "+s2);
		else
			JOptionPane.showMessageDialog(null, "\nO horista "+e3.getNome()+" tem o maior salário R$ "+s3);
		
	}
	
}