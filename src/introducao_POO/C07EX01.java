package introducao_POO;

import java.util.Scanner;

public class C07EX01 {

	public static void main(String[] args) {

		class Taluno {
			String nome;
			float media;
		}
		
		Taluno Aluno = new Taluno();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com o Nome:  ");
		Aluno.nome = s.nextLine();
		System.out.print("Entre com a Média: ");
		Aluno.media = s.nextFloat();
		
		
		System.out.println();
		System.out.println("Nome ....................: " + Aluno.nome);
		System.out.println("Média ...................: " + Aluno.media);
		
		s.close();
		
	}

}
