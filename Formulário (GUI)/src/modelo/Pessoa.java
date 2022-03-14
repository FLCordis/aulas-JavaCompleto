package modelo;

public class Pessoa {

	private String nome;
	private String email;
	private Genero sexo;
	private String cidade;
	
	public Pessoa() {
		this("não informado", "usr@servidor.com.br", Genero.MASCULINO, "L.I.N.S");
	}

	public Pessoa(String nome, String email, Genero sexo, String cidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Genero getSexo() {
		return sexo;
	}

	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String toString() {
		return "Nome: " + nome + "\n" + 
				"Email: " + email + "\n" +
				"Genêro: " + sexo + "\n" +
				"Cidade: " + cidade;
				
	}
}
