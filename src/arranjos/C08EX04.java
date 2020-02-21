package arranjos;

import java.util.Scanner;

public class C08EX04 {

	public static void main(String[] args) {
		
		int a[] =new int[5];
		int i, j, x;
		Scanner s = new Scanner(System.in);
		
		// Entrada de dados
		for(i=0; i<=4; i++) {
			System.out.print("Entre com o " + (i+1) + "º elemento: ");
			a[i] = s.nextInt();
		}
		
		// Processamento ordenacao
		for(i=0; i<=4; i++)
			for(j=0; j<=4; j++)
				if(a[i] > a[j]) {
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
		
		// Apresentacao dos arranjos
		System.out.println();
		for (i=0; i<=4; i++)
			System.out.println((i+1) + "º valor = " + a[i]);
		
		s.close();
		
	}

}
