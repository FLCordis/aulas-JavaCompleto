package estruturaSequencial;
import java.util.Locale;

public class exercicio1 {

	public static void main(String[] args) {
		
		String product1 = "Computador";
		String product2 = "Mesa de Escritório";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Produtos: %n%s, que custa $%.2f. %n%s, que custa $%.2f. %n", product1, price1, product2, price2);
		System.out.printf("%nRecorde: %d anos, código %d e gênero %s. %n", age, code, gender);
		System.out.printf("%nMedida com oito casas decimais: %.8f %nArredondado (três casas): %.3f", measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("%nUS Ponto decimal: %.3f", measure);
		
	}
}
