package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of the products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\nProduct #" + i +" data: ");
			System.out.print("Common (c), Used (u) or Imported (i)?: ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (type == 'c') {
				list.add(new Product(name, price));
			}
			
			else if (type == 'u') {
				System.out.print("Manufactured Date (dd/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}
			
			else {
				System.out.print("Custom fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
				
		}
		

		System.out.println("\n=== $ PRICE TAGS $ ===");
		for (Product prod:list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
