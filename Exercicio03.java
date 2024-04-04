package tarefa07;
import java.util.Scanner;
public class Exercicio03 {
public static void main(String[] Args) {

		//Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um valor 1 :");
		int Valor1 = scanner.nextInt();
		System.out.println("Digite um valor 2 :");
		int Valor2 = scanner.nextInt();
		System.out.println("Digite um valor 3 :");
		int Valor3 = scanner.nextInt();

		if (Valor1 > Valor2 && Valor1 > Valor3 && Valor2 > Valor3) {
		System.out.println(Valor1 + " , " + Valor2);
		float Rst1 = Valor1 + Valor2;
		System.out.println("A soma dos 2 maiores numero digitado foi: " + Rst1);
		} else if (Valor2 > Valor1 && Valor2 > Valor3 && Valor3 > Valor1) {
		System.out.println(Valor2 + " , " + Valor3);
		float Rst2 = Valor2 + Valor3;
		System.out.println("A soma dos 2 maiores numero digitado foi: " + Rst2);
		} else if (Valor3 > Valor1 && Valor3 > Valor2 && Valor2 > Valor1) {
		System.out.println(Valor3 + " , " + Valor2);
		float Rst3 = Valor3 + Valor2;
		System.out.println("A soma dos 2 maiores numero digitado foi: " + Rst3);
		} else if (Valor2 > Valor1 && Valor2 > Valor3 && Valor1 > Valor3) {
		System.out.println(Valor2 + " , " + Valor1);
		float Rst4 = Valor2 + Valor1;
		System.out.println("A soma dos 2 maiores numero digitado foi: " + Rst4);
		}

		scanner.close();
	}
}
