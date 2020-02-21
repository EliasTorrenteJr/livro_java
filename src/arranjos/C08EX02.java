package arranjos;

import java.util.Scanner;

public class C08EX02 {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		int b[] = new int[10];
		int i;
		Scanner s = new Scanner(System.in);
		
		// Entrada de dados
		for(i=0; i<=9; i++) {
			System.out.print("Entre com o " + (i+1) + "º número: ");
			a[i] = s.nextInt();
		}
		
		// Processamento par ou impar sobre os INDICES e não dos valores atribuidos
		for(i=0; i<=9; i++) {
			if(i%2 == 0) {
				b[i] = a[i] * 5;
			} else {
				b[i] = a[i] + 5;
			}
		}
		
		// Apresentação dos arranjos
		System.out.println();
		for(i=0; i<=9; i++)
			System.out.println("A[" + (i+1) + "] = " + a[i]);
		System.out.println();
		for (i=0; i<=9; i++)
			System.out.println("B[" + (i+1) + "] = +" + b[i]);
		
		s.close();

	}

}
