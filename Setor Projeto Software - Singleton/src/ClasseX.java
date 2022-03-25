
public class ClasseX {

	//Guardar a referência da instância criada.
	private static ClasseX refInstancia = null;
	
	//Construtor "private" é impossível para outras classes instânciarem objetos desse tipo.
	private ClasseX() {
		System.out.println("Criando instância ClasseX.");
	}
	
	//Método getInstance provendo uma forma de recuperar a referência ao unico objeto criado.
	public static ClasseX getInstance() {
		if(refInstancia == null)
			refInstancia = new ClasseX();
		return refInstancia;
	}

}
