package utility;

public class CurrencyConverter {
	
	public static final double DolarBuy(double quantity, double dolar) {
		return (quantity*dolar) + (quantity*dolar*0.06);
	}
}
