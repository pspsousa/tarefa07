package tarefa07;
import java.util.Scanner;
public class Exercicio13 {
public static void main(String[]Args) {

		// Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o Desconto e o total a pagar (total a pagar = total - Desconto), sabendo-se que: - Se quantidade <= 5 o Desconto será de 2% - Se quantidade > 5 e quantidade <=10 o Desconto será de 3% - Se quantidade > 10 o Desconto será de 5%
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do Produto: ");
		String NMProduto = scanner.next();

		System.out.println("Digite a Quantidade do produto: ");
		float QtdAdquirida = scanner.nextFloat();
		System.out.println("Digite o valor Unitario do Produto: ");
		float PreUnt = scanner.nextFloat();

		float TQtdValorUnt = QtdAdquirida * PreUnt;

		if (QtdAdquirida <= 5) {
			float Desconto = 2 * TQtdValorUnt / 100;
			float ValorComDesc = TQtdValorUnt - Desconto;
			System.out.println("O seu Produto é " + NMProduto + " e o valor total apagar com Desconto de 2% e : "+ ValorComDesc);
		} else if (QtdAdquirida > 5 && QtdAdquirida <= 10) {
			float Desconto2 = 3 * TQtdValorUnt / 100;
			float ValorComDesc2 = TQtdValorUnt - Desconto2;
			System.out.println("O seu Produto é " + NMProduto + " e o valor total apagar com Desconto de 3% e : "+ ValorComDesc2);
		} else if (QtdAdquirida > 10) {
			float Desconto3 = 5 * TQtdValorUnt / 100;
			float ValorComDesc3 = TQtdValorUnt - Desconto3;
			System.out.println("O seu Produto é " + NMProduto + " e o valor total apagar com Desconto de 5% e : "+ ValorComDesc3);
		}

		scanner.close();
	}
}
