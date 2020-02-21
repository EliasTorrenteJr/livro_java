package introducao_POO;

class Pai {
	protected void executa() {
		System.out.println("Ação da classe-pai");
	}
}
class Filho extends Pai {
	protected void executa() {
		System.out.println("Ação da classe-filho");
	}
}

public class C07EX11 {

	public static void main(String[] args) {

		Pai p = new Pai();
		Filho f = new Filho();
		
		p.executa();
		f.executa();
		
		p = f;
		p.executa();
		
	}

}
