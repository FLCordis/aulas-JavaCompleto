package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double raio, area, pi = 3.14159;
		
		System.out.print("Insira o valor da ÁREA: ");
		raio = teclado.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("Entrada = %.2f%n", raio);
		System.out.printf("Saída = %.4f", area);
		
		teclado.close();
	}
}
