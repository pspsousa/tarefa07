package tarefa07;
import java.util.Scanner;
public class Exercicio11 {
public static void main(String[]Args) {

	// Uma fruteira está vendendo frutas com a seguinte tabela de preços: Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

	
	Scanner scanner = new Scanner (System.in);	
		
	System.out.println("Digite a quantidade de Morangos: ");
	float MorangosKG = scanner.nextFloat();
	System.out.println("Digite a quantidade de Maças: ");
	float MacaKG = scanner.nextFloat();
	
	if(MorangosKG <= 5 &&  MacaKG <= 5 ) {
	float MorangoAte5Kg = MorangosKG*2.50f;
	float MacaAte5Kg = MacaKG*1.80f;
	float SomaVFFrutas = MorangoAte5Kg+MacaAte5Kg;
	System.out.println("Valor total da Compra foi: "+SomaVFFrutas);
		
	if(SomaVFFrutas > 25 && MorangosKG+MacaKG > 8){
	float SomaVFFrutas10 = 10*SomaVFFrutas/100;
	float SomaFinal10 = SomaVFFrutas - SomaVFFrutas10;
	System.out.println("Valor total da compra foi: "+SomaFinal10);
	}
			
	}else if(MorangosKG > 5 && MacaKG > 5) {
	float MorangoAcimaDe5Kg = MorangosKG*2.20f;
	float MacaAcimaDe5Kg = MacaKG*1.50f;
	float SomaVFFrutas02 = MorangoAcimaDe5Kg+MacaAcimaDe5Kg;
	System.out.println("Valor total da Compra foi: "+SomaVFFrutas02);
		
	if(SomaVFFrutas02 > 25 && MorangosKG+MacaKG > 8) {
	float SomaValorMas10_02 = 10*SomaVFFrutas02/100;
	float SomaValorFinal02 = SomaVFFrutas02 - somaValorMas10_02;
	System.out.println("Valor total da Compra foi: "+SomaValorFinal02);
	}
	}
	scanner.close();	
	}
}
