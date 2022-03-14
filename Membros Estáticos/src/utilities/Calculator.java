package utilities;

public class Calculator {

	// Como a classe é de "utilidade" ou seja, ela é usada com ou sem o objeto,
	// os metodos serão estáticos e assim não precisam ser estânciados.
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
