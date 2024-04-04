package tarefa07;
import java.util.Scanner;
public class Exercicio07 {
public static void main(String[] Args) {

	// Ler dois valores e imprimir uma das três mensagens a seguir:	‘Números iguais’, caso os números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo maior’, caso o segundo seja maior que o primeiro.


		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int Valor1 = scanner.nextInt();
		System.out.println("Digite o segundo valor: ");
		int Valor2 = scanner.nextInt();

		if (Valor1 == Valor2) {
		System.out.println("Os numero são iguais");
		} else if (Valor1 > Valor2) {
		System.out.println("O primeiro valor e o maior");
		} else if (Valor2 > Valor1) {
		System.out.println("O segundo valor e o maior");
		}

		scanner.close();
	}
}
