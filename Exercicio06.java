package tarefa07;
import java.util.Scanner;
public class Exercicio06 {
public static void main(String[]Args) {

	// Ler o nome de 2 times e o número de Gol marcados na partida (para cada time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.


		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o nome do primeiro Time: ");
		String Time1 = scanner.next();
		System.out.println("Digite o nome do segundo Time: ");
		String Time2 = scanner.next();
		System.out.println("Digite o numero de Gol marcado pelo o primeiro time: ");
		int GolTime1 = scanner.nextInt();
		System.out.println("Digite o numero de Gol marcado pelo o segundo Time: ");
		int GolTime2 = scanner.nextInt();
		
		
		if(GolTime1 > GolTime2) {
		System.out.println("O time "+Time1+" Ganhou a partida.");
		System.out.println("O placar foi "+Time1+GolTime1+" X "+GolTime2+Time2);
		}else if(GolTime2 > GolTime1) {
		System.out.println("O time "+Time2+" Ganhou a partida.");
		System.out.println("O placar foi "+Time2+GolTime2+" X "+GolTime1+Time1);
		}else if(GolTime1 == GolTime2) {
		System.out.println("Os times empataram a partida.");
		System.out.println("O placar foi "+Time2+GolTime2+" X "+GolTime1+Time1);
		}
		
		scanner.close();
	}
}
