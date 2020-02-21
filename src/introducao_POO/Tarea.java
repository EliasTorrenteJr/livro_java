package introducao_POO;

public class Tarea {
	
	// Área de um Quadrado
	public static long area (int x) {
		long area = x*x;
		return (area);
	}
	
	// Área de um Cilindro
	public static double area (float r, float h) {
		double area = r * r * 3.14159 * h;
		return (area);
	}
	
	// Área de um Cubo
	public static int area (int x, int y, int z) {
		int area = x * y* z;
		return (area);
	}

}
