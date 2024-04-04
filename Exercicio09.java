package tarefa07;
import java.util.Scanner;
public class Exercicio09 {
public static void main(String[] Args) {

	// Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
	 

		Scanner scanner = new Scanner(System.in);

		String G-gasolina = "Gasolina";
		String A-álcool = "Alcool";

		System.out.println("Digite o Combs desejado: ");
		String Combs = scanner.next();


		float Litro = 3 * 3.30f / 100;
		float LitroComDesconto = 3.30f - Litro;
		float LtDesc20 = 5 * 3.30f / 100;
		float ValorGas20 = 3.30f - LtDesc20;

		float LitroAlcool = 4 * 2.90f / 100;
		float LtAlcDesc = 2.90f - LitroAlcool;
		float LtGasDesc20 = 6 * 2.90f / 100;
		float ValorAlc20 = 2.90f - LtGasDesc20;

		if (Combs.equalsIgnoreCase(G-gasolina)) {
		System.out.println("Foi escolhido o Combs " + G-gasolina);
		System.out.println("Digite a Qtd Litros: ");
		float Qtd_Litros_Gasolina = scanner.nextFloat();
		if (Qtd_Litros_Gasolina <= 20) {
		float ValorFinal = Qtd_Litros_Gasolina * LitroComDesconto;
		System.out.println("O valor Ficou R$ " + ValorFinal);sss
		} else if (Qtd_Litros_Gasolina > 20) {
		float ValorGas20_02 = Qtd_Litros_Gasolina * ValorGas20;
		System.out.println("O valor Ficou R$ " + ValorGas20_02);
		}

		} else if (Combs.equalsIgnoreCase(A-álcool)) {
		System.out.println("Foi escolhido o Combs " + A-álcool);
		System.out.println("Digite a Qtd de Litros: ");
		float QtdDeLitrosAlcool = scanner.nextFloat();
		if (QtdDeLitrosAlcool <= 20) {
		float valorFinalAlcool = QtdDeLitrosAlcool * LtAlcDesc;
		System.out.println("O valor Ficou R$ " + ValorFinalAlcool);
		} else if (QtdDeLitrosAlcool > 20) {
		float ValorFnAlc20 = QtdDeLitrosAlcool * ValorAlc20;
		System.out.println("O valor Ficou R$ " + ValorFnAlc20);
		}
		}

		scanner.close();

	}
}
