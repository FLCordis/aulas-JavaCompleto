
public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		//Jeito "normal".
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------------------------");
		
		//Usando o each.
		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}
