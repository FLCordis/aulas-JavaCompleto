package main;

import visao.Visao;
import controle.Controle;

public class Main {
	public static void main(String[] args) {
		Visao visao = new Visao();
		Controle controle = new Controle(visao);		
		controle.inicia();
	}
}