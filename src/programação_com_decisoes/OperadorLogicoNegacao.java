package programação_com_decisoes;

import java.util.Scanner;

public class OperadorLogicoNegacao {

	public static void main(String[] args) {
		// Exercicio C04EX09
		
		int a,b,c,x;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com o valor de <a>: ");
		a = s.nextInt();
		
		System.out.print("Entre com o valor de <b>: ");
		b = s.nextInt();
		
		System.out.print("Entre com o valor de <c>: ");
		c = s.nextInt();
		
		if (!(c>5)) {
			x = (a+b)*c;
		} else {
			x = (a-b)*c;
		}
		
		System.out.println("\n O resultado de x equivale a: " + x);
		
		s.close();

	}

}
