package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rc = new Rectangle();
		
		System.out.print("Insert the Rectangle width: ");
		rc.width = sc.nextDouble();
		System.out.print("Insert the Rectangle height: ");
		rc.height = sc.nextDouble();
		
		System.out.printf("\nArea: %.2f\n", rc.area());
		System.out.printf("Perimeter: %.2f\n", rc.perimeter());
		System.out.printf("Diagonal: %.2f\n", rc.diagonal());
		
		sc.close();
	}
}
