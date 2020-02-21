/**
 * Utilização do Método Construtor sem parametros declarados nos seus atributos, servido apenas para inicializa-los
 */

package introducao_POO;

import java.util.Scanner;

public class C07EX08 {

	public static void main(String[] args) {

		Taluno6 aluno = new Taluno6();
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
		System.out.println("Nome: " + aluno.nome);
		System.out.println("Média: " + aluno.calcularMedia(aluno.n1, aluno.n2));
		System.out.println("Sala: " + aluno.sala);
		
		System.out.println();
		System.out.print("Situação: ");
		if (Taluno6.condicaoAluno(aluno.calcularMedia(aluno.n1, aluno.n2), 5.0)) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		s.close();

	}

}
