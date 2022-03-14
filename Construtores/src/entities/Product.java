package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	// Construtor geralmente fica sempre depois dos atributos e antes dos métodos.

	// Construtor é o primeiro a ser executado na instânciação.
	// Construtor padrão sem valores.
	
	public Product() {
	}

	// Construtor que precisa pegar os valores para ser criado.
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}


	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}