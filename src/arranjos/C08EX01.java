package arranjos;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class C08EX01 {

	public static void main(String[] args) {

		float mdg[] = new float [8];
		float soma = 0, media;
		int i;
		DecimalFormat df = new DecimalFormat("0.00");
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		for (i=0; i<=7; i++) {
			System.out.print("Media " + (i+1) + "º aluno: ");
			mdg[i] =s.nextFloat();
			soma += mdg[i];
		}
		
		media = soma/8;
		
		System.out.println();
		System.out.println("Média Geral = " + df.format(media));

		s.close();
	}

}
