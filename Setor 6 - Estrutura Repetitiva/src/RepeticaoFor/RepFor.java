package RepeticaoFor;

import java.util.Scanner;

public class RepFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira quantas repetições você gostaria de ter: ");
		int x = sc.nextInt();
		int soma = 0;
		
		System.out.print("Somando: " + soma);
		for (int i = 0;i<x; i++) {
			System.out.print(" + " + i);
			soma += i;
		}
		
		System.out.println(" = ?\nA soma de tudo deu: " + soma);
		
		sc.close();
	}
}
