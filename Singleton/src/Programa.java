
public class Programa {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ClasseX obj1 = ClasseX.getInstance();
		System.out.println(obj1);
		
		ClasseX obj2 = ClasseX.getInstance();
		System.out.println(obj2);
	}
}
