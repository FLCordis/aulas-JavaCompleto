package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert the size of the Product Array: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Insert the "+(i+1)+"º Product Name: ");
			String name = sc.nextLine();
			System.out.print("Insert the Product Price: $");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			System.out.println();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/n;
		
		System.out.printf("Avg. Price: %.2f%n", avg);
		
		sc.close();
	}
}
