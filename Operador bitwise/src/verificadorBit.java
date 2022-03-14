import java.util.Scanner;

public class verificadorBit {

	/* Um uso comum do Bitwise � verificar o valor do bit dentro de um n�mero
	   Ou seja, voc� cria uma m�scara com um valor que possui 1 s� na posi��o
	   desejada e assim com o &, ele vai te dar 1 caso possua 1, ou 0 caso 0.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mascara = 0b00100000; // � 32 em n�mero decimal.
		int n = sc.nextInt();
		
		if ((n&mascara) != 0) {
			System.out.println("O 6th bit � verdadeiro! (1)");
		}
		else {
			System.out.println("O 6th bit � falso! (0)");
		}
		sc.close();
	}
}
