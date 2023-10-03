package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class EstudoDatas {

	public static void main(String[] args) {
	
		//Hora Local
		LocalDate d1 = LocalDate.now();
		System.out.println("d1: " + d1);
		
		LocalDateTime d2 = LocalDateTime.now();
		System.out.println("d2: " + d2);
		
		LocalDate d3 = LocalDate.parse("2023-10-01");
		System.out.println("d3: " + d3);
		
		LocalDateTime d4 = LocalDateTime.parse("2023-10-01T01:30:26");
		System.out.println("d4: " + d4);
		
		Instant d5 = Instant.now();
		System.out.println("d5: " + d5);
		
		Instant d6 = Instant.parse("2023-10-01T01:30:26Z");
		System.out.println("d6: " + d6);
		
		Instant d7 = Instant.parse("2023-10-01T01:30:26-03:00");
		System.out.println("d7: " + d7);
	
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		LocalDate dataLocalFormatada = LocalDate.parse("02/10/2023",fmt1 );
		System.out.println("Data local formatado: " + dataLocalFormatada);
		LocalDateTime dataLocalTempo =LocalDateTime.parse("02/10/2023 18:02",fmt2);
		System.out.println("Data e hora local formatado: " + dataLocalTempo);

		LocalDate dataLocalIndividual = LocalDate.of(2023,7, 20);
		System.out.println("Data local individual: " + dataLocalIndividual);
	
		LocalDateTime dataLocalIndividualTime = LocalDateTime.of(2023,7, 20, 18, 47);
		System.out.println("Data local individual e tempo: " + dataLocalIndividualTime);
		
		//Formatar datas recebidas 
		
		System.out.println("d1: " + d1.format(fmt1));
		System.out.println("d2: " +  d2.format(fmt2));
		System.out.println("d4: " +  d4.format(fmt3));
		System.out.println("d4 Data e hora recebida e formatada: " +  d4.format(fmt4));
	
		//De global para local
		
		LocalDate r1 = LocalDate.ofInstant(d6, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d6, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d6, ZoneId.systemDefault());
		//DateTimeFormatter r2 = LocalDate.ofInstant(, null);
		/*DateTimeFormatter r2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter r3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter r4 = DateTimeFormatter.ISO_DATE_TIME;*/
		
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		System.out.println("r3: " + r3);
		
		System.out.println("dia: " + d1.getDayOfMonth());
		System.out.println("mes: " + d1.getMonthValue());
		System.out.println("ano: " + d1.getYear());
		
		
	}

}
