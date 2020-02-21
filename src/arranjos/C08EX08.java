package arranjos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C08EX08 {

	public static void main(String[] args) {
		
		float nota[][] = new float[8][4];
		byte i, j ;
		DecimalFormat df = new DecimalFormat("00.00");
		Scanner s = new Scanner(System.in);
		
		for(i=0; i<=7; i++) {
			
			System.out.println();
			System.out.println();
			System.out.println("Aluno ---> " + (i+1));
			System.out.println();
			
			for(j=0; j<=3; j++) {
				System.out.print((j+1) + "ª Nota = ");
				nota[i][j] =  s.nextFloat();
			}
			
		}
		
		System.out.println();
		System.out.println("Aluno  Nota1  Nota2  Nota3  Nota4");
		System.out.println("---------------------------------");
		
		for(i=0; i<=7; i++) {
			System.out.print((i+1) + "---> ");
			
			for(j=0; j<=3; j++) {
				System.out.print(" " + df.format(nota[i][j]) + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		s.close();

	}

}
