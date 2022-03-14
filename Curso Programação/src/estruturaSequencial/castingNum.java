package estruturaSequencial;

public class castingNum {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 2;
		double resultado;
		
		resultado = a/b;
		System.out.printf("Sem casting: %.1f", resultado);
		
		resultado = (double) a/b; //Casting para transformar o resultado de dois inteiros em um double.
		System.out.printf("%nCom casting: %.1f %n", resultado);
		
		double x;
		int y;
		
		x = 5.5;
		y = (int) x;
		
		System.out.printf("O número transformado de Double para int: %d", y);

	}

}
