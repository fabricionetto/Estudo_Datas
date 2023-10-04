package datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class OperacaoDatas {

	public static void main(String[] args) {

		// Hora Local
		LocalDate dataLocal = LocalDate.parse("2023-10-04");

		// Diminuindo dias
		LocalDate umaSemanaAntes = dataLocal.minusDays(7);
		LocalDate umaSemanaDepois = dataLocal.plusDays(7);
		System.out.println("Data local= " + dataLocal);
		System.out.println("Data local semana antes= " + umaSemanaAntes);
		System.out.println("Data local semana depois= " + umaSemanaDepois);

		System.out.println(" ");
		// Diminuindo dias e horario
		LocalDateTime dataLocalHora = LocalDateTime.parse("2023-10-04T08:55:34");
		LocalDateTime umaSemanaAntes1 = dataLocalHora.minusDays(7);
		LocalDateTime umaSemanaDepois1 = dataLocalHora.plusDays(7);
		System.out.println("Data local e hora= " + dataLocalHora);
		System.out.println("Data local e hora semana antes= " + umaSemanaAntes1);
		System.out.println("Data local e hora semana depois= " + umaSemanaDepois1);
		System.out.println(" "); 

		// Diminuindo dias e horario Global
		Instant dataGlobalHora = Instant.parse("2023-10-04T08:55:34Z");
		Instant umaSemanaAntesGlobal = dataGlobalHora.minus(7, ChronoUnit.DAYS);
		Instant umaSemanaDepoisGlobal = dataGlobalHora.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Data global= " + dataLocal);
		System.out.println("Data e hora semana antes global= " + umaSemanaAntesGlobal);
		System.out.println("Data e hora semana depois global= " + umaSemanaDepoisGlobal);
		
		
		//Calculos com datas
		
		Duration t1 = Duration.between(umaSemanaAntesGlobal, dataGlobalHora);
		System.out.println("Data local= " + t1);
		// System.out.println("Data local= " + dataLocal);
		// System.out.println("Data local e hora= " + dataLocalHora);
		// System.out.println("Data e hora global= " + dataGlobalHora);

		/*
		 * LocalDate somarDias = d1.minusDays(5); LocalDate somarDias1 = d1.plusDays(5);
		 * 
		 * Instant d5 = Instant.now(); System.out.println("d5: " + d5);
		 * 
		 * Instant d6 = Instant.parse("2023-10-01T01:30:26Z"); System.out.println("d6: "
		 * + d6);
		 * 
		 * Instant somaDiasGlobal = d6.minus(5, ChronoUnit.DAYS);
		 * 
		 * System.out.println("Dias somados: " + somarDias);
		 * System.out.println("Dias somados1: " + somarDias1);
		 * 
		 * Duration t1 = Duration.between(d1, somarDias);
		 * System.out.println("Total de Dias: " + t1);
		 */
	}

}
