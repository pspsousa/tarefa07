package tarefa07;
import java.util.Scanner;
public class Exercicio08 {
public static void main(String[] Args) {

	// Seja o seguinte algoritmo: início ler x ler y z <- (x*y) + 5	 se z <= 0 então resposta <- ‘A’  senão	 se z <= 100 então  resposta <- ‘B’  senão resposta <- ‘C’ fim_se fim_se escrever z, resposta fim Faça um teste de mesa e complete o quadro a seguir para os seguintes valores.


		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor de X: ");
		float ValorX = scanner.nextFloat();
		System.out.println("Digite o valor do Y: ");
		float ValorY = scanner.nextFloat();
		float ValorZ = (ValorX * ValorY) + 5;

		if (ValorZ <= 0) {
		System.out.println("A");
		} else if (ValorZ <= 100) {
		System.out.println("B");
		} else {
		System.out.println("C");
		}

		scanner.close();
	}
}
