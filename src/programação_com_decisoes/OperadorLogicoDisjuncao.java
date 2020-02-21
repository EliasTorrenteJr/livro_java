package programação_com_decisoes;

import java.util.Scanner;

public class OperadorLogicoDisjuncao {

	public static void main(String[] args) {
		// Exercicio C04EX07
		
		int codigo;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com o valor do código: ");
		codigo = s.nextInt();
		
		if (codigo == 1 || codigo==2 || codigo==3) {
			if (codigo==1) 
				System.out.println("um");
			if (codigo==2) 
				System.out.println("dois");
			if (codigo==3) 
				System.out.println("tres");
		} else {
			System.out.println("codigo invalido");
		}
		
		s.close();

	}

}
