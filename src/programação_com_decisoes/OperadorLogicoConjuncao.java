package programação_com_decisoes;

import java.util.Scanner;

public class OperadorLogicoConjuncao {

	public static void main(String[] args) {
		// Exercicio C04EX06
		
		int numero;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		numero = s.nextInt();
		
		if (numero>=20 && numero<=90) {
			System.out.println("O valor esta entre 20 e 90");
		} else {
			System.out.println("O valor não esta entre 20 e 90");
		}
		
		s.close();

	}

}
