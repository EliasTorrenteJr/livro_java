package programação_com_decisoes;

import java.util.Scanner;

public class OperadorLogicoDisjuncaoExclusiva {

	public static void main(String[] args) {
		// Exercicio C04EX08
		
		String nome1, nome2;
		int sexo1, sexo2;
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro nome: ");
		nome1 = s1.nextLine();
		System.out.print("Entre com o sexo: M --> [1] // F --> [2] : ");
		sexo1 = s1.nextInt();
		
		System.out.print("Entre com o segundo nome: ");
		nome2 = s2.nextLine();
		System.out.print("Entre com o sexo: M --> [1] // F --> [2] : ");
		sexo2 = s2.nextInt();
		
		if (sexo1==1 ^ sexo2==1) {
			System.out.println(nome1 + " pode se casar com " + nome2);
		} else {
			System.out.println(nome1 + "não pode se casar com " + nome2);
		}
		
		s1.close();
		s2.close();

	}

}
