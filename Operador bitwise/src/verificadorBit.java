import java.util.Scanner;

public class verificadorBit {

	/* Um uso comum do Bitwise é verificar o valor do bit dentro de um número
	   Ou seja, você cria uma máscara com um valor que possui 1 só na posição
	   desejada e assim com o &, ele vai te dar 1 caso possua 1, ou 0 caso 0.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mascara = 0b00100000; // é 32 em número decimal.
		int n = sc.nextInt();
		
		if ((n&mascara) != 0) {
			System.out.println("O 6th bit é verdadeiro! (1)");
		}
		else {
			System.out.println("O 6th bit é falso! (0)");
		}
		sc.close();
	}
}
