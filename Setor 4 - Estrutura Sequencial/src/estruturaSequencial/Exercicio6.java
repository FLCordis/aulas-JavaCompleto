package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int p1, p2, n1, n2;
		double price1, price2, total;
		
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		p1 = teclado.nextInt();
		n1 = teclado.nextInt();
		price1 = teclado.nextDouble();
		
		p2 = teclado.nextInt();
		n2 = teclado.nextInt();
		price2 = teclado.nextDouble();
		
		total = n1*price1 + n2*price2;

		System.out.printf("TOTAL A PAGAR: %.2f", total);
		
		teclado.close();
	}
}
