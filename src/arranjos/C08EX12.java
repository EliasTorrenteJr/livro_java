package arranjos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08EX12 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		
		int t;
		String n;
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		// Entrada dos nomes
		System.out.println();
		System.out.print("Quanto nomes a entrar? ");
		t = s1.nextInt();
		
		System.out.println();
		for(int i=0; i<t; i++) {
			System.out.printf("Entre com o %3d� nome: ", i+1);
			n = s2.nextLine();
			lista.add(n);
		}
		
		// Apresenta��o dos nomes
		System.out.println();
		for(int i = 0; i < lista.size(); i++) {
			n = lista.get(i);
			System.out.printf("%3d� nome = %s\n", i+1, n);
		}
		
		s1.close();
		s2.close();
	}

}
