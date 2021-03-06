package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Employee> list = new ArrayList<>();

		// CRIANDO O REGISTRO DE DATA.

		System.out.print("How many Employees will be registered? : ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\n Employee #" + i + ": ");

			System.out.print("ID: ");
			int id = sc.nextInt();

			while (hasId(list, id)) {
				System.out.print("ID taken! Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}

		// AUMENTANDO O SAL?RIO DO EMPREGADO.

		System.out.print("\nEnter the Employee ID to increase the salary: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This ID does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		// IMPRIMINDO LISTA DE EMPREGADOS.

		System.out.println("\nList of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

	private static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
