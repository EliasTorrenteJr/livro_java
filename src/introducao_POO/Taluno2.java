package introducao_POO;

public class Taluno2 {
	String nome;
	float media;
	
	// A seguir um Método que avalia se o aluno esta aprovado ou não
	public static boolean CondicaoAluno (float AlunoMedia, double CorteMedia) {
		boolean CondicaoAluno = true;
		if (AlunoMedia < CorteMedia)
			CondicaoAluno = false;
		return (CondicaoAluno);
	}
}
