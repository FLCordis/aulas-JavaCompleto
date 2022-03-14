package estruturaSequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int A, B, C, D;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o valor inteiro para A, B, C, D.");
		System.out.print("A: ");
		A = teclado.nextInt();
		
		System.out.print("B: ");
		B = teclado.nextInt();
		
		System.out.print("C: ");
		C = teclado.nextInt();
		
		System.out.print("D: ");
		D = teclado.nextInt();
		
		int dif = (A*B-C*D);
		
		System.out.printf("%nDiferença: %d", dif);
		
		teclado.close();
	}
}
