package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.outsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of Employees: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Employee N#"+ (i+1) +" Data\n");
			System.out.print("Outsourced (y/n): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new outsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}
			else {
				list.add(new Employee(name, hours, valuePerHour)); // Pode colocar dentro do add para que a Var não exista e fique menor o código.
			}
		}
		System.out.println();
		System.out.println("PAYMENTS $");
		for (Employee emp:list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
