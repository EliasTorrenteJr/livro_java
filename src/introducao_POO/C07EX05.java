package introducao_POO;

import java.util.Scanner;

public class C07EX05 {

	public static void main(String[] args) {

		Taluno3 Aluno = new Taluno3();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com o nome: ");
		Aluno.nome = s.nextLine();
		System.out.print("Entre com a média: ");
		Aluno.media = s.nextFloat();
		
		// atributo SALA que Taluno3 herdou de Tsala
		System.out.print("Entre com a sala: ");
		Aluno.sala = s.nextInt();
		
		System.out.println();
		System.out.println("Nome .......: " + Aluno.nome);
		System.out.println("Média ......: " + Aluno.media);
		System.out.println("Sala .......: " + Aluno.sala);
		
		System.out.println();
		System.out.print("Condição: ");
		if (Taluno3.CondicaoAluno(Aluno.media, 5.0)) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		s.close();

	}

}
