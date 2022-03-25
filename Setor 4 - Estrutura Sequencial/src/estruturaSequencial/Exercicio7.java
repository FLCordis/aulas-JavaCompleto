package estruturaSequencial;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira os valores para A, B e C:");
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		
		triangulo = A*C/2;
		System.out.printf("a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.%nR:%.3f ", triangulo);
		
		double pi = 3.14159;
		circulo = pi * Math.pow(C, 2.0);
		System.out.printf("%nb) a �rea do c�rculo de raio C. (pi = 3.14159)%nR:%.3f", circulo);
		
		trapezio = (A+B)*C/2;
		System.out.printf("%nc) a �rea do trap�zio que tem A e B por bases e C por altura%nR:%.3f", trapezio);
		
		quadrado = B*B;
		System.out.printf("%nd) a �rea do quadrado que tem lado B.%nR:%.3f", quadrado);
		
		retangulo = A*B;
		System.out.printf("%ne) a �rea do ret�ngulo que tem lados A e B.%nR:%.3f", retangulo);
		
		teclado.close();
	}
}
