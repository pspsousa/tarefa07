package Tarefa07;
import java.util.Scanner;
public class Exercicio02 {
public static void main(String[] Args) {

		//Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.


		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor 1 :");
		int Valor1 = scanner.nextInt();
		System.out.println("Digite o valor 2 :");
		int Valor2 = scanner.nextInt();
		System.out.println("Digite o valor 3 :");
		int Valor3 = scanner.nextInt();

		if (Valor1 > Valor2 && Valor1 > Valor3 && Valor2 > Valor3) {
		System.out.println(Valor1 + " , " + Valor2);
		} else if (Valor2 > Valor1 && Valor2 > Valor3 && Valor3 > Valor1) {
		System.out.println(Valor2 + " , " + Valor3);
		} else if (Valor3 > Valor1 && Valor3 > Valor2 && Valor2 > Valor1) {
		System.out.println(Valor03 + " , " + Valor2);
		} else if (Valor2 > Valor1 && Valor2 > Valor3 && Valor1 > Valor3) {
		System.out.println(Valor2 + " , " + Valor1);
		}

		scanner.close();
	}
}
