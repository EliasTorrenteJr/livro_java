package arranjos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08EX14 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		int t, i;
		String n;
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		// Entrada dos dados
		System.out.print("Entre com o número de nomes a serem inseridos no Array: ");
		t = s1.nextInt();
		
		System.out.println();
		for(i=0; i<t; i++) {
			System.out.printf("Entre com o %3dº nome: ", i+1);
			n = s2.nextLine();
			lista.add(i,n);
		}
		
		// Apresentação dos dados
		System.out.println();
		for(i = 0; i < lista.size(); i++) {
			n = lista.get(i);
			System.out.printf("%3dº nome = %s\n", i+1, n);
		}
		
		// Alteração de um nome da lista
		System.out.println();
		System.out.printf("Entre a posição a ser substituída..: ");
		i = s1.nextInt();
		System.out.printf("Entre com o novo nome..............: ");
		n = s2.nextLine();
		lista.set(i-1, n);
		
		// Apresentação dos nomes após a mudança
		System.out.println();
		for(i=0; i<lista.size(); i++) {
			n = lista.get(i);
			System.out.printf("%3dº nome = %s\n", i+1, n);
		}
		
		// Remoção de um item da lista
		System.out.println();
		System.out.printf("Entre com a posição do item a ser removido.....: ");
		i = s1.nextInt();
		lista.remove(i-1);
		
		// Apresentação dos nomes após a remoção do item, note que agora a lista possui um item a menos
		System.out.println();
		for(i=0; i<lista.size(); i++) {
			n = lista.get(i);
			System.out.printf("%3dº nome = %s\n", i+1, n);
		}
		
		// Remoção de todos os item do Array
		lista.clear();
		
		// Apresentação dos nomes após a remoção de todos os itens, a lista não será apresentada, pois esta vazia, o laço for não
		// será executado
		System.out.println();
		for(i=0; i<lista.size(); i++) {
			n = lista.get(i);
			System.out.printf("%3dº nome = %s\n", i+1, n);
		}
		
		s1.close();
		s2.close();

	}

}
