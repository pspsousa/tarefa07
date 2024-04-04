package tarefa07;
import java.util.Scanner;
public class Exercicio14 {
public static void main(String[]Args) {

	// Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo: A atribuição de conceitos obedece a tabela abaixo.

	
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o nome do Aluno: ");
		String NMAluno = scanner.next();
		
		System.out.println("Digite a primeira nota do Aluno ("+NMAluno+") :");
		float N1 = scanner.nextFloat();
		System.out.println("Digite a segunda nota do Aluno ("+NMAluno+") :");
		float N2 = scanner.nextFloat();
		System.out.println("Digite a terceira nota do Aluno ("+NMAluno+") :");
		float N3 = scanner.nextFloat();
		
		float MediaAV = (N1+N2+N3)/3;
		float MediaAp = (N1+(N2*2)+(N3*3)+MediaAV)/7;
		
		if(MediaAp >= 9.00f) {
		System.out.println("A media de Aproveitamento do Aluno ("+NMAluno+") : "+MediaAp);
		System.out.println("Conceito : A");
		}else if(MediaAp >= 7.50f && MediaAp < 9.00f) {
		System.out.println("A media de Aproveitamento do Aluno ("+NMAluno+") : "+MediaAp);
		System.out.println("Conceito : B");
		}else if(MediaAp >= 6.00f && MediaAp < 7.50f){
		System.out.println("A media de Aproveitamento do Aluno ("+NMAluno+") : "+MediaAp);
		System.out.println("Conceito : C");
		}else if(MediaAp < 6.00f) {
		System.out.println("A media de Aproveitamento do Aluno ("+NMAluno+") : "+MediaAp);
		System.out.println("Conceito : D");
		}
		scanner.close();
	}
}
