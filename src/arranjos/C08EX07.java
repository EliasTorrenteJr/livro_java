package arranjos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class C08EX07 {

	public static void main(String[] args) {

		String a[] = new String [10], x, pesq, resp;
		int i, j, meio, comeco, fim;
		boolean acha;
		Scanner s = new Scanner(System.in);
		
		// Entrada de dados
		for(i=0; i<=9; i++) {
			System.out.print("Entre com o " + (i+1) + "º nome: ");
			a[i] = s.nextLine();
		}
		
		// Processamento ordenado dos nomes
		for(i=0; i<=9; i++) {
			for(j=0; j<=9; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
		
		// Apresentação dos nomes
		System.out.println();
		for(i=0; i<=9; i++) {
			System.out.println((i+1) + "º nome = " + a[i]);
		}
		
		// Apresentação por pesquisa binaria
		do {
			System.out.println();
			System.out.print("Entre o valor a ser pesquisado: ");
			pesq = s.nextLine();
			
			comeco = 0;
			meio = 0;
			fim = 9;
			acha = false;
			
			while(comeco<=fim & acha == false) {
				meio = (comeco + fim) / 2;
				if(pesq.compareTo(a[meio]) == 0) {
					acha = true;
				} else {
					if(pesq.compareTo(a[meio]) < 0) {
						fim = meio - 1;
					} else {
						comeco = meio + 1;
					}
				}
			}
			
			if(acha==true) {
				System.out.println(pesq + " está na posição " + (meio + 1) + ".");
			} else {
				System.out.println(pesq + " não foi localizado.");
			}
			
			System.out.println();
			System.out.println();
			System.out.println("Continuar? [S]im / [N]ão + <Enter>.");
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				resp = br.readLine();
			} catch (Exception e) {
				resp = "";
			}
			resp = resp.toUpperCase();
		} while(resp.compareTo("S") == 0);
	
		s.close();
	}

}
