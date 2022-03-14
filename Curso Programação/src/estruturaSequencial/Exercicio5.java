package estruturaSequencial;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		int fnum, workTime;
		double pricetime, salary;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Número funcionário: ");
		fnum = teclado.nextInt();
		System.out.print("Tempo de trabalho: ");
		workTime = teclado.nextInt();
		System.out.print("Valor de trabalho por hora: ");
		pricetime = teclado.nextDouble();
		
		salary = (double) workTime * pricetime;
		System.out.printf("%nNUM WORKER: %d"
				+ "%nSALARY: U$%.2f", fnum, salary);
		
		teclado.close();
		
	}
}
