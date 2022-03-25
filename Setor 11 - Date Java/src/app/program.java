package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); //Coloca a Timezone padrão em GMT.
		
		Date x1 = new Date();
		// Date x1 = new Date(System.currentTimeMillis);   é outro jeito que ele conta pelos milisegundos.
		Date x2 = new Date(0L);
		Date x3 = new Date(1000L * 60L * 60L * 5L); // 1 segundo = mil mili * 60 p/ minutos * 60 p/ horas e dps a hora requisitada.
		
		Date y1 = sdf1.parse("11/03/2022");
		Date y2 = sdf2.parse("11/03/2022 15:25:05");
		Date y3 = Date.from(Instant.parse("2022-03-11T15:39:10Z")); //Formato de Data Padrão com UTC (3hrs de atraso).
		
		System.out.println("\nData não-formatada/Padrão Java");
		System.out.println("Y1: " + y1);
		System.out.println("Y2: " + y2);
		
		System.out.println("\nData formatada padrão dd/mm/yyyy hh:mm:ss");
		System.out.println("Y1: " + sdf2.format(y1));
		System.out.println("Y2: " + sdf2.format(y2));
		System.out.println("Y3 (ISO 8601): " + sdf2.format(y3));
		
		System.out.println("\nHora atual: " + sdf2.format(x1));
		System.out.println("Hora do milisegundo requisitado (UTC): " + sdf2.format(x2));
		System.out.println("Horário de 5 da manhã (-3 BR Timezone) de 1970 " + sdf2.format(x3));
		
		System.out.println("\n=======================================");
		System.out.println("Timezone GMT\n");
		
		System.out.println("Y1: " + sdf3.format(y1));
		System.out.println("Y2: " + sdf3.format(y2));
		System.out.println("Y3 Padrão ISO 8601 - Classe Instant: " + sdf3.format(y3));
		
		System.out.println("\nHora atual: " + sdf3.format(x1));
		System.out.println("Hora do milisegundo requisitado (BRT): " + sdf3.format(x2));
		System.out.println("Horário de 5 da manhã de 1970 " + sdf3.format(x3));
	}
}
