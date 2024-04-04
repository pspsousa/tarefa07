package tarefa07;
import java.util.Scanner;
public class Exercicio10 {
public static void main(String[] Args) {

	// Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.
	 

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a idade do primeiro homem: ");
		int IdadeH1 = scanner.nextInt();
		System.out.println("Digite a idade do segundo homem: ");
		int IdadeH2 = scanner.nextInt();
		System.out.println("Digite a idade da primeiro mulher: ");
		int IdadeM1 = scanner.nextInt();
		System.out.println("Digite a idade da segunda mulher: ");
		int IdadeM2 = scanner.nextInt();

		if (IdadeH1 > IdadeH2 && IdadeM1 > IdadeM2) {
		int SomaHVelhoMNova = IdadeH1 + IdadeM2;
		System.out.println("A soma do homem mas velho com a Mulher mas Nova é " + SomaHVelhoMNova);
		int SomaHNovoMVelha = IdadeH2 + IdadeM1;
		System.out.println("A soma da idade do homem mas novo, com a mulher mas velha e " + SomaHNovoMVelha);
		} else if (IdadeH2 > IdadeH1 && IdadeM2 > IdadeM1) {
		int SomaH2VelhoM1Nova = IdadeH2 + IdadeM1;
		System.out.println("A soma do homem mas velho com a Mulher mas Nova é " + SomaH2VelhoM1Nova);
		int SomaH1NovoM2Velha = IdadeH1 + IdadeM2;
		System.out.println("A soma da idade do homem mas novo, com a mulher mas velha e "+ SomaH1NovoM2Velha);
		}
		scanner.close();
	}
}
