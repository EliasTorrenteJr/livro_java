/**
 * Programa exemplo para cálculo de tabuada de um valor numérico qualquer fornecido a partir do teclado para operação em 
 * modo console.
 */

/*
 * Programa .............: Tabuada (LinhasDeComentarios)
 * Autor (es) ...........: Augusto Manzono & Roberto Affonso
 * Data .................: 10/06/2010
 * Versão ...............: 1.2
 * Revisão ..............: 08/02/2020
 */

package programação_com_decisoes;

import java.util.Scanner;

public class LinhasDeComentarios {

	public static void main(String[] args) {

		int N, I, R;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Programa: TABUADA \n");
		System.out.print("Entre um valor inteiro para calculo: ");
		N = s.nextInt();

		System.out.println();
		
		/**
		 * O trecho de código seguinte é responsável pela apresentação da tabuada de um valor numérico qualquer
		 */
		
		for (I=1; I<=10; I++) {
			// Cálculo da tabuada propriamente dito
			R = N*I;
			
			// Apresentação da tabuada no formato: N x I = R
			System.out.printf("%3d x %2d = %d \n", N,I,R);
		}
		
		s.close();
	}

}
