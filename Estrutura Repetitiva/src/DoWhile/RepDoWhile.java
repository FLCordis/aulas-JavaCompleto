package DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class RepDoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char x;
		
		do {
			System.out.print("\nQual a temperatura em Celsius?: ");
			double temp = sc.nextDouble();
			
			double formula = (9*temp/5) + 32;
			System.out.printf("A temperatura equivalente em Fahrenheit é: %.1f%n", formula);
			
			System.out.print("Deseja continuar? (S/N): ");
			x = sc.next().charAt(0);
			
		} while (x != 'n');
	}
}
