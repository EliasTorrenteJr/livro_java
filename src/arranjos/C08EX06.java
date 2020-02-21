package arranjos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class C08EX06 {

	public static void main(String[] args) {

		int a[] = new int[10], i, pesq;
		boolean acha;
		String resp;
		Scanner s = new Scanner(System.in);
		
		// Entrada dos dados
		for(i=0; i<=9; i++) {
			System.out.print("Entre com o " + (i+1) + "º elemento: ");
			a[i] = s.nextInt();
		}
		// Fim da entrada de dados
		
		// Pesquisa de dados
		do {
			System.out.println();
			System.out.print("Entre com o valor a ser pesquisado: ");
			pesq = s.nextInt();
			
			i=0;
			acha = false;
			while(i <= 9 & acha == false)
				if (pesq == a[i])
					acha = true;
				else
					i++;
			
			if (acha == true)
				System.out.println(pesq + " localizado na posição " + (i+1));
			else
				System.out.println(pesq + " não foi localizado.");
			
			System.out.println();
			System.out.println();
			System.out.println("Continua? [S]im / [N]ão + <Enter>.");
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				resp = br.readLine(); }
			catch (Exception e) {
				resp = "";
			}

			resp = resp.toUpperCase();
		}
		while (resp.compareTo("S") == 0);
		
		s.close();

	}

}
