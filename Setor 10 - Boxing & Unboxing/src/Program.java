
public class Program {

	public static void main(String[] args) {
		
		//Boxing, coloca um valor dentro de um Objeto de uma classe.
		int x = 20;
		Object obj = x;
		System.out.println(obj);
		
		//Unboxing, retira o valor da classe pra uma variável compativel.
		int y = (int) obj; // Precisa do casting por que eles não seriam compativeis.
	}
}
