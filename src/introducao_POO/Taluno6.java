package introducao_POO;

public class Taluno6 extends Tsala3 {
	
	public String nome;
	public float n1, n2;
	private float media;
	
	Taluno6() {
		nome = "";
		n1 = 0;
		n2 = 0;
	}
	protected void finalize() {} // Override é quando um método passa a ser reescrito na classe-filha, alterando seu comportamento
	
	public float calcularMedia (float n1, float n2) {
		media = (n1+n2) / 2;
		return (media);
	}
	
	public static boolean condicaoAluno (float alunoMedia, double corteMedia) {
		boolean condicaoAluno = true;
		if (alunoMedia < corteMedia)
			condicaoAluno = false;
		return (condicaoAluno);
	}
	

}
