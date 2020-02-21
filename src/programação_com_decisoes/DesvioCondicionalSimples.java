package programação_com_decisoes;

import java.util.Scanner;

public class DesvioCondicionalSimples {

	public static void main(String[] args) {
		// Exercicio C04EX04

		int A,B,R;
		Scanner	s	=	new Scanner(System.in);
		
		System.out.print("Entre com o valor de A: ");
		A	=	s.nextInt();
		
		System.out.print("Entre com o valor de B: ");
		B	=	s.nextInt();
		
		R	=	A+B;
		System.out.println();
		if (	R > 10	)		{
			System.out.println("Resultado	=	" + R);
		}
		
		s.close();
		
	}

}
