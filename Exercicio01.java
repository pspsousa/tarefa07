package tarefa07;
import java.util.Scanner;
public class Exercicio01 {
public static void main(String[] args) {

	//Ler um valor e escrever se é positivo, negativo ou zero.

	Scanner scanner = new Scanner(System.in);

	System.out.println("Digite o valor: ");

	int Valor = scanner.nextInt();

	if(Valor >=0)
	System.out.println("O numero "+Valor+" E positivo");
	else
	System.out.println("O numero "+Valor+" e negativo");

	scanner.close();
	}
}