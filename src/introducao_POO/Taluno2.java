package introducao_POO;

public class Taluno2 {
	String nome;
	float media;
	
	// A seguir um M�todo que avalia se o aluno esta aprovado ou n�o
	public static boolean CondicaoAluno (float AlunoMedia, double CorteMedia) {
		boolean CondicaoAluno = true;
		if (AlunoMedia < CorteMedia)
			CondicaoAluno = false;
		return (CondicaoAluno);
	}
}
