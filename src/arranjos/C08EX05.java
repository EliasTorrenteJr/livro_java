package arranjos;

import java.util.Scanner;

public class C08EX05 {

	public static void main(String[] args) {

		String a[] = new String[5],x;
		int i, j;
		Scanner s = new Scanner(System.in);
		
		// Entrada de dados
		for(i=0; i<=4; i++) {
			System.out.print("Entre com o " + (i+1) + "º nome: ");
			a[i] = s.nextLine();
		}
		
		// Processamento ordenacao
		for(i=0; i<=4; i++)
			for(j=0; j<=4; j++)
				if (a[i].compareTo(a[j]) >0) {
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
		
		// Apresentacao dos arranjos
		System.out.println();
		for(i=0; i<=4; i++)
			System.out.println((i+1) + "º nome = " + a[i]);
		
		s.close();

	}

}
