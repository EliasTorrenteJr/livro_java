package introducao_POO;

import java.util.Scanner;

public class C07EX07 {

	public static void main(String[] args) {

		Taluno5 aluno = new Taluno5();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com o nome: ");
		aluno.nome = s.nextLine();
		System.out.print("Entre com a n1: ");
		aluno.n1 = s.nextFloat();
		System.out.print("Entre com a n2: ");
		aluno.n2 = s.nextFloat();
		System.out.print("Entre com a sala: ");
		aluno.sala = s.nextInt();
		
		System.out.println();
		System.out.println("Nome ........: " + aluno.nome);
		System.out.println("Media .......: " + aluno.CalculaMedia(aluno.n1, aluno.n2));
		System.out.println("Sala ........: " + aluno.sala);
		
		System.out.println();
		System.out.print("Situação: ");
		if (Taluno5.CondicaoAluno(aluno.CalculaMedia(aluno.n1, aluno.n2), 5.0))		{
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		s.close();

	}

}
