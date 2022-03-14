package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("\nInsert your name: ");
		employee.name = sc.next();
		System.out.print("Insert your Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Insert your Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + employee);
		
		System.out.print("\nInsert the percentage of the Salary increase: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.print("\nUpdated Data: "+ employee);
		sc.close();
	}
	
}
