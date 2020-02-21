package arranjos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C08EX16 {

	public static void main(String[] args) {

		Map<Integer, String> lista = new HashMap<>();
		int t, i;
		String n;
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		// Entrada de dados
		System.out.print("Quantos nomes a entrar? ");
		t = s1.nextInt();
		
		System.out.println();
		for(i=0; i<t; i++) {
			System.out.printf("Entre com o %3d� nome: ", i+1);
			n = s2.nextLine();
			lista.put(i, n);
		}
		
		// Apresenta��o dos nomes
		System.out.println();
		for(i=0; i<t; i++) {
			n = lista.get(i);
			System.out.printf("%3d� nome = %s\n", i+1, n);
		}
		
		// Remo��o de um item da lista
		System.out.println();
		System.out.print("Entre a posi��o a ser removida .........: ");
		i = s2.nextInt();
		lista.remove(i-1);
		
		// Apresenta��o dos nomes ap�s remo��o de um item
		// A lista possui valor null no elemento removido
		System.out.println();
		for(i=0; i<t; i++) {
			n = lista.get(i);
			System.out.printf("%3d� nome = %s\n", i+1, n);
		}
		
		// Remo��o de todos os itens da lista
		lista.clear();
		
		// Apresenta��o dos nomes ap�s remo��o de todos os itens
		// O la�o FOR apresenta as posi��es com valor null
		System.out.println();
		for(i=0; i<t; i++) {
			n = lista.get(i);
			System.out.printf("%3d� nome = %s\n", i+1, n);
		}
		
		s1.close();
		s2.close();
	}

}
