package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter Account number: ");
		int number = sc.nextInt();
		System.out.print("Enter Account Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("\nIs there an initial deposit? (Y/N): ");
		char response = Character.toUpperCase(sc.next().charAt(0));
		
		if (response == 'Y') {
			System.out.print("Enter the initial deposit value: $");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println("\nAccount Data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a Deposit value: $");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated data: " + account);
		
		System.out.print("\nEnter a Withdraw value: $");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated data: " + account);
		
		sc.close();
	}
}
