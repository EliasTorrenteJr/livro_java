package introducao_POO;

import java.util.Scanner;

public class C07EX03 {

	public static void main(String[] args) {

		Taluno2 Aluno = new Taluno2();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com o Nome: ");
		Aluno.nome = s.nextLine();
		System.out.print("Entre com a Média: ");
		Aluno.media = s.nextFloat();
		
		System.out.println();
		System.out.println("Nome .........: " + Aluno.nome);
		System.out.println("Média ........: " + Aluno.media);
		System.out.println();
		System.out.print("Situação: ");
		
		if (Taluno2.CondicaoAluno(Aluno.media, 5.0)) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		s.close();

	}

}
