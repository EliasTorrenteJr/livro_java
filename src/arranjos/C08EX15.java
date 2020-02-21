package arranjos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C08EX15 {

	public static void main(String[] args) {

		Set<String> lista = new HashSet<>();
		long t;
		int i;
		String n;
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		// Entrada dos nomes na coleção Lista
		System.out.print("Quantos nomes a entrar? ");
		t = s1.nextLong();
		
		System.out.println();
		for(i=0; i<t; i++) {
			System.out.printf("Entre com o %3dº nome: ",i+1);
			n = s2.nextLine();
			lista.add(n);
		}
		t = lista.size();
		
		// Apresentação dos nomes na matriz Relação1 após a entrada dos dados na coleção Lista
		String relacao1[] = (String[]) lista.toArray(new String[0]);
		System.out.println();
		System.out.printf("Total de %1d elementos. \n\n", t);
		for(i=0; i<t; i++) {
			System.out.printf("%3dº nome = %s\n", i+1, relacao1[i]);
		}
		
		// Remoção de um item da lista
		System.out.println();
		System.out.print("Qual o nome sera removido: ");
		n = s2.nextLine();
		lista.remove(n);
		t = lista.size();
		
		// Apresentação dos nomes na matriz Relação2 após a remoção de um dos nomes da coleção Lista
		String relacao2[] = (String[]) lista.toArray(new String[0]);
		System.out.println();
		System.out.printf("Total de %1d elementos.\n\n", t);
		for(i=0; i<t; i++) {
			System.out.printf("%3dº nome = %s\n", i+1, relacao2[i]);
		}
		System.out.println();
		
		// Remoção de todos os itens da lista
		lista.clear();
		t = lista.size();
		
		// Apresentação dos nomes apos remoção de todos os itens, o conteúdo de Relação3 não será apresentado, pois esta vazio
		// o laço for portanto não será executado
		String relacao3[] = (String[]) lista.toArray(new String[0]);
		System.out.println();
		System.out.printf("Total de %1d elementos.\n\n", t);
		for(i=0; i<t; i++) {
			System.out.printf("%3dº nome = %s\n", i+1, relacao3[i]);
		}
		
		
		s1.close();
		s2.close();
	}

}
