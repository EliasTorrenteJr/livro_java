package introducao_POO;

import java.util.Scanner;

public class C07EX12 {

	public static void main(String[] args) {

		String valor;
		long n1;
		double n2;
		int n3;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		valor = s.nextLine();
		
		System.out.println();
		n1 = Long.valueOf(valor).longValue();
		System.out.println("[Area do Quadrado .........: " + area(n1));
		n3 = Integer.valueOf(valor).intValue();
		System.out.println("[Area do Quadrado .........: " + area(n3, n3, n3));
		n2 = Float.valueOf(valor).floatValue();
		System.out.println("[Area do Quadrado .........: " + area(n2, n2));
		
		s.close();

	}
	
	public static long area (long x) {
		long area = x*x;
		return (area);
	}
	
	public static double area (double r, double h) {
		double area = r*r*3.14159*h;
		return (area);
	}
	
	public static int area (int x, int y ,int z) {
		int area = x*y*z;
		return (area);
	}
	
}
