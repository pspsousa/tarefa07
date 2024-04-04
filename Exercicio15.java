package tarefa07;
import java.util.Scanner;
public class Exercicio15 {
public static void main(String[]Args) {

		//Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um dos seguintes requisitos deve ser satisfeito: - Ter no mínimo 65 anos de idade. - Ter trabalhado no mínimo 30 anos. - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos. Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Solicitar aposentadoria' ou 'Não Solicitar'.
		
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Digite o codigo do empregado: ");
		int CdgVerif = scanner.nextInt();
		
		String CdgVerifString="";
		
		switch(CdgVerif) {
		case 1: CdgVerifString = "MATHEUS";
		break;
		case 2: CdgVerifString = "JOÃO";
		break;
		case 3: CdgVerifString = "NILTON";
		break;
		case 4: CdgVerifString = "LUAN";
		break;
		case 5: CdgVerifString = "THIAGO";
		break;
		default: System.out.println("Codigo Invalido");
		}

		System.out.println(CdgVerifString);
		System.out.println();
		System.out.println();
		System.out.println("Digite a data de nascimento do "+CdgVerifString+" : ");
		int DtNasc = scanner.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("Digite o ano de ingresso na empresa: ");
		int Ingresso = scanner.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("Digite o ano de saida: ");
		int Saida = scanner.nextInt();
		System.out.println();
		System.out.println();
		
		int IdadeClien = 2024 - DtNasc;
		int anosPrestacao = Saida-Ingresso;
		
		if(IdadeClien >= 65) {
		System.out.println("Solicitar aposentadoria para ("+CdgVerifString+") OK");
		System.out.println();
		}else if(anosPrestacao >= 30) {
		System.out.println("Solicitar aposentadoria para ("+CdgVerifString+") OK");
		System.out.println();
		}else if(IdadeClien >= 60 && anosPrestacao >= 25) {
		System.out.println("Solicitar aposentadoria para ("+CdgVerifString+") OK");
		System.out.println();
		}else {
		System.out.println("Não Solicitar aposentadoria para("+CdgVerifString+")");
		System.out.println();
		}
		scanner.close();
	}
}
