package programação_com_decisoes;

import java.util.Scanner;

public class EstruturaRepeticaoDoWhile {

	public static void main(String[] args) {

		int i, resp = 1;
		Scanner s = new Scanner(System.in);
		
		do {
			i=1;
			do {
				System.out.println("i = " + i);
				i++;
			} while (i<=5);
			
			System.out.println();
			System.out.println("Deseja continuar? Se SIM digite [1] se NÃO digite [2]");
			resp = s.nextInt();
			
		} while (resp==1);
		
		System.out.println("Programa finalizado.");
		
		s.close();

	}

}
