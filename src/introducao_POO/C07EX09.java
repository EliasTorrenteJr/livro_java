package introducao_POO;

public class C07EX09 {

	public static void main(String[] args) {

		Taluno7 aluno = new Taluno7("Augusto Manzano", 10,9,5);
		mostrarDados(aluno);
		
		aluno.nome = "Roberto Affonso";
		aluno.n1 = 10;
		aluno.n2 = 10;
		aluno.sala = 6;
		mostrarDados (aluno);
	}
	
	public static void mostrarDados (Taluno7 dados) {
		System.out.println();
		System.out.println("Nome ........: " + dados.nome);
		System.out.println("Média .......: " + dados.calcularMedia(dados.n1, dados.n2));
		System.out.println("Sala ........: " + dados.sala);
		System.out.println();
		System.out.print("Situação ....: ");
		if (Taluno7.condicaoAluno(dados.calcularMedia(dados.n1, dados.n2), 5.0)) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}

}
