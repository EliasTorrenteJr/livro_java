package programa��o_com_decisoes;

import java.util.Scanner;

public class EstruturaControleSwitchCase {

	public static void main(String[] args) {
		// Exercicio C04EX12
		
		int mes;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com o valor referente ao m�s: ");
		mes = s.nextInt();
		
		System.out.println();
		
		switch (mes) {
		case 1: 	System.out.println("Janeiro");		break;
		case 2:		System.out.println("Fevereiro");	break;
		case 3: 	System.out.println("Mar�o");		break;
		case 4: 	System.out.println("Abril");		break;
		case 5: 	System.out.println("Maio");			break;
		case 6: 	System.out.println("Junho");		break;
		case 7:		System.out.println("Julho");		break;
		case 8: 	System.out.println("Agosto");		break;
		case 9:		System.out.println("Setembro");		break;
		case 10:	System.out.println("Outubro");		break;
		case 11:	System.out.println("Novembro");		break;
		case 12:	System.out.println("Dezembro");		break;

		default:	System.out.println("M�s inv�lido");	break;
		}
		
		s.close();
		
	}

}
