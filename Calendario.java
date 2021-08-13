package exercicios;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class Calendario{
	public static void main(String[] args){
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			
			Date d = Date.from(Instant.parse("2021-08-14T18:46:08Z"));
			System.out.println(sdf.format(d));
			
			//ACDRESCENTANDO HORAS
			Calendar cal = Calendar.getInstance();
			//Pegando a hora e d
			cal.setTime(d);
			//Acrescentando 4 horas
			cal.add(Calendar.HOUR_OF_DAY, 4);
			//Atualizando a hora de d
			d = cal.getTime();
			//imprimindo
			System.out.println(sdf.format(d));
			
			//OBTENDO UNIDADE DE TEMPO
			Calendar unidadeCalendar = Calendar.getInstance();
			unidadeCalendar.setTime(d);
			//pegando a hora,minuto e segundo
			int hours = unidadeCalendar.get(Calendar.HOUR);
			int minutes = unidadeCalendar.get(Calendar.MINUTE);
			int seconds = unidadeCalendar.get(Calendar.SECOND);
			System.out.println("Hours: "+hours);
			System.out.println("Minutes: "+minutes);
			System.out.println("Seconds: "+seconds);
			//pegando o ano
			int year = unidadeCalendar.get(Calendar.YEAR);
			//Calendar.MONTH vai de 0 a 11
			int month = 1+unidadeCalendar.get(Calendar.MONTH);
			//pegando a semana do mês
			int weekOfMonth = unidadeCalendar.get(Calendar.WEEK_OF_MONTH);
			//pegando a semana
			int dayOfWeek = unidadeCalendar.get(Calendar.DAY_OF_WEEK);
			
			
			System.out.println("Year: "+ year);
			System.out.println("Month: "+ month);
			System.out.println("Week of month: "+ weekOfMonth);
			System.out.println("Day of week: "+ dayOfWeek);
	}
}
