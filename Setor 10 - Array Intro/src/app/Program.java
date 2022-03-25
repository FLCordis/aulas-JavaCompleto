package app;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert the size of the Array: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		System.out.println();
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Insert the number for the position ["+i+"] in the Array: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum/n;
		System.out.printf("Average Height: %.2f", avg);
		
		sc.close();
	}
}
