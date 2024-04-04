package tarefa07;
import java.util.Scanner;
public class Exercicio04 {
public static void main(String[] Args) {

		//Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.


		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor 1 :");
		int Valor1 = scanner.nextInt();
		System.out.println("Digite o valor 2 :");
		int Valor2 = scanner.nextInt();
		System.out.println("Digite o valor 3 :");
		int Valor3 = scanner.nextInt();

		if (Valor1 > Valor2 && Valor1 > Valor3 && Valor2 > Valor3) {
		System.out.println(Valor1 + " , " + Valor2);
		System.out.println("Os numero digitados em ordem crescente : " + Valor2 + (" , ") + Valor1);
		} else if (Valor2 > Valor1 && Valor2 > Valor3 && Valor3 > Valor1) {
		System.out.println(Valor2 + " , " + Valor3);
		System.out.println("Os numero digitados em ordem crescente : " + Valor3 + (" , ") + Valor2);
		} else if (Valor3 > Valor1 && Valor3 > Valor2 && Valor2 > Valor1) {
		System.out.println(Valor3 + " , " + Valor2);
		System.out.println("Os numero digitados em ordem crescente : " + Valor2 + (" , ") + Valor3);
		} else if (Valor2 > Valor1 && Valor2 > Valor3 && Valor1 > Valor3) {
		System.out.println(Valor2 + " , " + Valor1);
		System.out.println("Os numero digitados em ordem crescente : " + Valor1 + (" , ") + Valor2);
		}

		scanner.close();
	}
}


