package introducao_POO;

public class Tarea {
	
	// �rea de um Quadrado
	public static long area (int x) {
		long area = x*x;
		return (area);
	}
	
	// �rea de um Cilindro
	public static double area (float r, float h) {
		double area = r * r * 3.14159 * h;
		return (area);
	}
	
	// �rea de um Cubo
	public static int area (int x, int y, int z) {
		int area = x * y* z;
		return (area);
	}

}
