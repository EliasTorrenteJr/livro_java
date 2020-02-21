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
		System.out.print("Entre com o n�mero de nomes a serem inseridos no Array: ");
		t = s1.nextInt();
		
		System.out.println();
		for(i=0; i<t; i++) {
			System.out.printf("Entre com o %3d� nome: ", i+1);
			n = s2.nextLine();
			lista.add(i,n);
		}
		
		// Apresenta��o dos dados
		System.out.println();
		for(i = 0; i < lista.size(); i++) {
			n = lista.get(i);
			System.out.printf("%3d� nome = %s\n", i+1, n);
		}
		
		// Altera��o de um nome da lista
		System.out.println();
		System.out.printf("Entre a posi��o a ser substitu�da..: ");
		i = s1.nextInt();
		System.out.printf("Entre com o novo nome..............: ");
		n = s2.nextLine();
		lista.set(i-1, n);
		
		// Apresenta��o dos nomes ap�s a mudan�a
		System.out.println();
		for(i=0; i<lista.size(); i++) {
			n = lista.get(i);
			System.out.printf("%3d� nome = %s\n", i+1, n);
		}
		
		// Remo��o de um item da lista
		System.out.println();
		System.out.printf("Entre com a posi��o do item a ser removido.....: ");
		i = s1.nextInt();
		lista.remove(i-1);
		
		// Apresenta��o dos nomes ap�s a remo��o do item, note que agora a lista possui um item a menos
		System.out.println();
		for(i=0; i<lista.size(); i++) {
			n = lista.get(i);
			System.out.printf("%3d� nome = %s\n", i+1, n);
		}
		
		// Remo��o de todos os item do Array
		lista.clear();
		
		// Apresenta��o dos nomes ap�s a remo��o de todos os itens, a lista n�o ser� apresentada, pois esta vazia, o la�o for n�o
		// ser� executado
		System.out.println();
		for(i=0; i<lista.size(); i++) {
			n = lista.get(i);
			System.out.printf("%3d� nome = %s\n", i+1, n);
		}
		
		s1.close();
		s2.close();

	}

}
