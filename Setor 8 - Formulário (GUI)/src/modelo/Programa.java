package modelo;

import gui.UICadastroPessoa;

public class Programa {

	public static void main(String[] args) {
		
		UICadastroPessoa janela = new UICadastroPessoa();
		janela.setVisible(true);
		
		Pessoa pessoaX = new Pessoa();
		pessoaX.setNome("Yoda");
		pessoaX.setEmail("master.yoda@republic.com");
		pessoaX.setSexo(Genero.MASCULINO);
		pessoaX.setCidade("Araraquara");
		
		janela.setPessoa(pessoaX);
	}

}
