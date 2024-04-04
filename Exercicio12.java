package tarefa07;
import java.util.Scanner;
public class Exercicio12 {
public static void main(String[]Args) {

	// Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a Senha. Se esta Senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘Senha incorreta’. Caso a Senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.

		
	Scanner scanner = new Scanner (System.in);	
	
	System.out.println("Digite o Codigo de Usuario: ");
	int CodigoCerto = scanner.nextInt();
	
	if(CodigoCerto == 1234) {
	System.out.println("Correto");
	}else if(CodigoCerto != 1234) {
	System.out.println("Usuario Invalido");
	System.out.println("Digite o Codigo Novamente: ");
	int NovaTentativa = scanner.nextInt();
	if(NovaTentativa != 1234) {
	System.out.println("Usuario Invalido");
	System.out.println("Digite o Codigo Novamente: ");
	int NovaTentativa02 = scanner.nextInt();
	if(NovaTentativa02 != 1234) {
	System.out.println("Usuario Invalido");
	}
	}
	}
	
	System.out.println("Digite a Senha: ");
	int SenhaCorreta = scanner.nextInt();
	
	if(SenhaCorreta == 9999) {
	System.out.println("Acesso Permitido");
	}else if(SenhaCorreta != 9999) {
	System.out.println("Senha incorreta");
	System.out.println("Digite Novamente sua Senha: ");
	int SenhaCorreta02 = scanner.nextInt();
	if(SenhaCorreta02 != 9999) {
	System.out.println("Senha incorreta");
	System.out.println("Digite Novamente sua Senha: ");
	int SenhaCorreta03 = scanner.nextInt();
	if(SenhaCorreta03 != 9999) {
	System.out.println("Senha incorreta");
	System.out.println("Usuario Bloqueado");
	}
	}
	}
	scanner.close();
	}
}
