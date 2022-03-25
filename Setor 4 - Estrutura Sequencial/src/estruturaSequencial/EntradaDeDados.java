package estruturaSequencial;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Entrada de Dados para String.
		/**
		String x;
		System.out.print("Digite o valor para X: ");
		x = teclado.next();
		System.out.println("Voc� digitou o valor: " + x);

		*/
		
		
		//Entrada de Dados para Int.
		/**
		int x;
		System.out.print("Digite um valor INTEIRO: ");
		x = teclado.nextInt();
		System.out.println("O valor INTEIRO digitado foi: " + x);

		*/
		
		
		//Entrada de Dados Ponto Flutuante.
		/**
		double x;
		System.out.print("Digite um valor com PONTO FLUTUANTE (virgula): "); //Se digitar com PONTO ir� dar erro pois o sistema � PTBR, 
		x= teclado.nextDouble();											// para transformar em PONTO deve mudar o Locale para US.
		System.out.printf("O valor de PONTO FLUTUANTE foi: %.2f", x);
		
		*/
		
		
		//Entrada de Dados Caractere.
		/**
		char x;
		x = teclado.next().charAt(0); //.charAt pegar� o caractere na posi��o informada.
		System.out.println("Voc� digitou: " + x);
		
		*/
		
		/**
		//Entrada de Dados em quebra de linhas.
		String l1, l2, l3;
		
		l1 = teclado.nextLine();
		l2 = teclado.nextLine();
		l3 = teclado.nextLine();
		
		System.out.println("Dados digitados: " + l1 + " " + l2 + " " + l3);
		
		*/
		
		//Entrada de Dados vari�veis.
		int x;
		String l1, l2, l3;
		
		x = teclado.nextInt();
		teclado.nextLine();		// Por que teclado.nextline??? - Qualquer Next feito sem ser o Line deixa uma quebra de Linha pendente,
		l1 = teclado.nextLine();// Ou seja, se n�o colocar isso, o l1 ficar� com valor vazio e voc� digitar� apartir do l2.
		l2 = teclado.nextLine();
		l3 = teclado.nextLine();
		
		System.out.printf("Dados digitados: %d, %s, %s, %s.", x, l1, l2, l3);
		
		teclado.close();
	}

}
