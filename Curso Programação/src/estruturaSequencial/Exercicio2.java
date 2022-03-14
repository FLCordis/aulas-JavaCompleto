package estruturaSequencial;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int x, y, soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira valores para a soma: ");
		
		x = teclado.nextInt();
		y = teclado.nextInt();	
		
		soma = x+y;
		
		System.out.printf("Entrada:%n"
				+ "%d%n"
				+ "%d%n%n", x, y);
		
		System.out.printf("Soma:%n"
				+ "%d%n", soma);
		
		teclado.close();
		
		}
}
