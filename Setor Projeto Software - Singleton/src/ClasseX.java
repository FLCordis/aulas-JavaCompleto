
public class ClasseX {

	//Guardar a refer�ncia da inst�ncia criada.
	private static ClasseX refInstancia = null;
	
	//Construtor "private" � imposs�vel para outras classes inst�nciarem objetos desse tipo.
	private ClasseX() {
		System.out.println("Criando inst�ncia ClasseX.");
	}
	
	//M�todo getInstance provendo uma forma de recuperar a refer�ncia ao unico objeto criado.
	public static ClasseX getInstance() {
		if(refInstancia == null)
			refInstancia = new ClasseX();
		return refInstancia;
	}

}
