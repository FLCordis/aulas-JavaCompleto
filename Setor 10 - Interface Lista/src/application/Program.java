package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); //Lista não aceita tipos primitivos, só Wrapper Class.
		
		list.add("Katarina");
		list.add("Epona");
		list.add("Argon");
		list.add("Anna");
		list.add(2, "Kyle");
		
		System.out.println(list.size());
		
		//Imprimir a lista.
		
		for (String x:list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		//Tipos de remoção.
		//list.remove("Anna");
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'K'); //Função lambda chamada 'Predicado'.
		
		for (String x:list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		//Achar a posição.
		System.out.println("Index of Epona: " + list.indexOf("Epona"));
		System.out.println("Index of Katarina: " + list.indexOf("Katarina")); // -1 quando ñ existe.
		
		System.out.println("-------------------");
		
		//Imprimir apenas quem começa com a Letra escolhida.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x:result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		// Encontrar o primeiro elemento que tem a letra escolhida.
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name); // Ele irá retornar o primeiro nome com A, se não achar retorna null.
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2); // Aqui ele retorna nulo pois não tem nomes com J.
		
	}
}
