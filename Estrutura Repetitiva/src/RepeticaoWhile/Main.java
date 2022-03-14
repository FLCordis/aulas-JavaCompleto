package RepeticaoWhile;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor para a soma (0 para sair): ");
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println("A soma deu: " + soma);
		
		sc.close();
	}
}
