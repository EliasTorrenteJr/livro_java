package introducao_POO;

public class Taluno3 extends Tsala {
	String nome;
	float media;
	
	public static boolean CondicaoAluno (float AlunoMedia, double CorteMedia) {
		boolean CondicaoAluno = true;
		if (AlunoMedia < 5.0) 
			CondicaoAluno = false;
		return (CondicaoAluno);
	}
}
