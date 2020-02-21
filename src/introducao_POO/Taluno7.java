package introducao_POO;

public class Taluno7 extends Tsala3 {
	public String nome;
	public float n1, n2;
	private float media;
	
	Taluno7 (String n, float x, float y, int sl) {
		nome = n;
		n1 = x;
		n2 = y;
		sala = sl;
	}
	protected void finalize() {}
	
	public float calcularMedia (float n1, float n2) {
		media = (n1+n2)/2;
		return (media);
	}
	
	public static boolean condicaoAluno (float mediaAluno, double mediaCorte) {
		boolean condicaoAluno = true;
		if (mediaAluno < mediaCorte)
			condicaoAluno = false;
		return (condicaoAluno);
	}
	
}
