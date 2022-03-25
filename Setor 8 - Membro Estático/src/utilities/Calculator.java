package utilities;

public class Calculator {

	// Como a classe � de "utilidade" ou seja, ela � usada com ou sem o objeto,
	// os metodos ser�o est�ticos e assim n�o precisam ser est�nciados.
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
