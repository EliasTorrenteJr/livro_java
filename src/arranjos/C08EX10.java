package arranjos;

import java.text.DecimalFormat;

public class C08EX10 {

	public static void main(String[] args) {

		float n1, n2, n3, n4, media;
		DecimalFormat df = new DecimalFormat("0.00");

		n1 = Float.parseFloat(args[0]);
		n2 = Float.parseFloat(args[1]);
		n3 = Float.parseFloat(args[2]);
		n4 = Float.parseFloat(args[3]);
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		if(media>=5) {
			System.out.print("Aluno APROVADO com Média: ");
		} else {
			System.out.print("Aluno REPROVADO com Média: ");
		}
		System.out.println(df.format(media));

	}

}
