package primeiroTermo.Fundamentos;
public class num9999for {

	public static void main(String[] args) {
		
		int num, num1, num2, s;
		
		for(num = 1000; num <= 9999; num++)
		{
			num1 = (num / 100);
			num2 = (num % 100);
			s = num1 + num2;
			if (s * s == num);
				System.out.print(" "+num);
		}

	}

}