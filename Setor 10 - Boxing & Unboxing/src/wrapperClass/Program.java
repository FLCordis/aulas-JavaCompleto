package wrapperClass;

public class Program {

	public static void main(String[] args) {

		// Wrapper Class ? o jeito natural da linguagem de fazer o Boxing e Unboxing, do tipo
		// classe, aceitando valores nulos tamb?m! .
		// OBS: Integer = Classe, int = tipo primitivo.
		int x = 20;
		
		Integer obj = x; // Integer ? o int.
		
		System.out.println(obj);

		int y = obj * 2;
	}
}
