package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
	
		System.out.print("Insert the Student name: ");
		student.name = sc.next();
		System.out.print("Insert the 1st Grade: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Insert the 2nd Grade: ");
		student.grade2 = sc.nextDouble();
		System.out.print("Insert the 3rd Grade: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("\nFINAL GRADE: %.2f", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.print("  = FAILED");
			System.out.printf("\nMISSING %.2f POINTS%n", student.missingPoints());
		}
		else {
			System.out.print(" = PASS");
		}
		sc.close();
	}
}
