package programação_com_decisoes;

import java.util.Scanner;

public class DesvioCondicionalComposto {

	public static void main(String[] args) {
		// Exercicio C04EX05

		int A,B,R;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com o valor de A: ");
		A = s.nextInt();
		
		System.out.print("Entre com o valor de B: ");
		B = s.nextInt();
		
		R= A+B;
		System.out.println();
		
		if (R>10) {
			System.out.println("Resultado maior que 10.");
		} else {
			System.out.println("Resultado menor ou igual a 10.");
		}
		
		s.close();
	}

}
