package programa��o_com_decisoes;

import java.util.Scanner;

public class EstruturaControleSwitchCaseSTR {

	public static void main(String[] args) {
		// Exercicio C04EX12
		
		String mes;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com o valor referente ao m�s: ");
		mes = s.nextLine();
		
		System.out.println();
		
		switch (mes) {
		case "um"		: 	System.out.println("Janeiro");		break;
		case "dois"		:	System.out.println("Fevereiro");	break;
		case "tres"		: 	System.out.println("Mar�o");		break;
		case "quatro"	: 	System.out.println("Abril");		break;
		case "cinco"	: 	System.out.println("Maio");			break;
		case "seis"		: 	System.out.println("Junho");		break;
		case "sete"		:	System.out.println("Julho");		break;
		case "oito"		: 	System.out.println("Agosto");		break;
		case "nove"		:	System.out.println("Setembro");		break;
		case "dez"		:	System.out.println("Outubro");		break;
		case "onze"		:	System.out.println("Novembro");		break;
		case "doze"		:	System.out.println("Dezembro");		break;

		default			:	System.out.println("M�s inv�lido");	break;
		}
		
		s.close();
		
	}

}
