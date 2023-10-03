package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EstudoDatas {

	public static void main(String[] args) {
	
		//Hora Local
		LocalDate dataLocal = LocalDate.now();
		System.out.println("Data local: " + dataLocal);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Data local e Hora: " + ldt);
		
		LocalDate ldp = LocalDate.parse("2023-10-01");
		System.out.println("Data local inserido: " + ldp);
		
		LocalDateTime ldtP = LocalDateTime.parse("2023-10-01T01:30:26");
		System.out.println("Data local e hora inserido: " + ldtP);
		
		Instant hg = Instant.now();
		System.out.println("Data global: " + hg);
		
		Instant ldpInstant = Instant.parse("2023-10-01T01:30:26Z");
		System.out.println("Data local e hora inserido: " + ldpInstant);
		
		Instant ldpInstant1 = Instant.parse("2023-10-01T01:30:26-03:00");
		System.out.println("Data local e hora inserido: " + ldpInstant1);
	
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate dataLocalFormatada = LocalDate.parse("02/10/2023",fmt1 );
		System.out.println("Data local formatado: " + dataLocalFormatada);
		LocalDateTime dataLocalTempo =LocalDateTime.parse("02/10/2023 18:02",fmt2);
		System.out.println("Data local formatado: " + dataLocalTempo);

		LocalDate dataLocalIndividual = LocalDate.of(2023,7, 20);
		System.out.println("Data local individual: " + dataLocalIndividual);
	
		LocalDateTime dataLocalIndividualTime = LocalDateTime.of(2023,7, 20, 18, 47);
		System.out.println("Data local individual e tempo: " + dataLocalIndividualTime);
	
	}

}
