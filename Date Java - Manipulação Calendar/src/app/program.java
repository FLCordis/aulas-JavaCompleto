package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2022-03-11T15:42:07Z"));
		//GMT tem 3 horas de diferença, não esqueça.
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		//Somando uma unidade de tempo
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println("\n + 4hrs");
		System.out.println(sdf.format(d));
		
		//Obtendo Unidade de Tempo
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("\n\n Minutes: " + minutes);
		
		int month = 1 + cal.get(Calendar.MONTH); // JAVA COMEÇA O VALOR NO ZERO, MÊS ZERO NÃO EXISTE.
		System.out.println("Month: " + month);
	}
}
