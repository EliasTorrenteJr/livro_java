package introducao_POO;

public class C07EX10 {

	public static void main(String[] args) {

		Tarea a = new Tarea();
		
		System.out.println("�rea: Quadrado ....: " + a.area(5));
		System.out.println("�rea: Cilindro ....: " + a.area(7,3));
		System.out.println("�rea: Cubo ........: " + Tarea.area(5,6,7));

	}

}
