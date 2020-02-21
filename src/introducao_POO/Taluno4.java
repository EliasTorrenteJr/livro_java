package introducao_POO;

public class Taluno4 extends Tsala {
	
	public String nome;
	public float n1, n2;
	private float media;
	
	public float CalculaMedia (float n1, float n2) {
		media = (n1+n2)/2;
		return (media);
	}
	
	public static boolean CondicaoAluno (float alunoMedia, double corteMedia) {
			boolean CondicaoAluno = true;
			if (alunoMedia < corteMedia)
				CondicaoAluno = false;
			return (CondicaoAluno);
	}
}
