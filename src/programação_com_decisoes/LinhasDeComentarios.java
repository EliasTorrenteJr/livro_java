/**
 * Programa exemplo para c�lculo de tabuada de um valor num�rico qualquer fornecido a partir do teclado para opera��o em 
 * modo console.
 */

/*
 * Programa .............: Tabuada (LinhasDeComentarios)
 * Autor (es) ...........: Augusto Manzono & Roberto Affonso
 * Data .................: 10/06/2010
 * Vers�o ...............: 1.2
 * Revis�o ..............: 08/02/2020
 */

package programa��o_com_decisoes;

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
		 * O trecho de c�digo seguinte � respons�vel pela apresenta��o da tabuada de um valor num�rico qualquer
		 */
		
		for (I=1; I<=10; I++) {
			// C�lculo da tabuada propriamente dito
			R = N*I;
			
			// Apresenta��o da tabuada no formato: N x I = R
			System.out.printf("%3d x %2d = %d \n", N,I,R);
		}
		
		s.close();
	}

}
