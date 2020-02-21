package arranjos;

import java.util.Scanner;

public class C08EX03 {

	public static void main(String[] args) {

		int a[] = new int [5];
		int i, soma = 0;
		Scanner s = new Scanner(System.in);
		
		// Entrada de dados
		for(i=0; i<=4; i++) {
			System.out.print("Entre com o " + (i+1) + "º número: ");
			a[i] = s.nextInt();
		}
		
		// Processamento par ou impar
		for(i=0; i<=4; i++)
			if (a[i] % 2 != 0)
				soma += a[i];
		
		// Apresentação dos arranjos
		System.out.println();
		System.out.println("Soma = " + soma);
		
		s.close();

	}

}
