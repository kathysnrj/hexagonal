package com.empresa.comercio.common;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

	public static LocalDateTime convertToLocalDateTime(String dateString) {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		return LocalDateTime.parse(dateString, formatter);
	}

	public static java.sql.Date convertToSqlDate(LocalDateTime localDateTime) {
		return java.sql.Date.valueOf(localDateTime.toLocalDate());
	}

	public static void main(String[] args) {
		// Ejemplo de uso
		String dateStr = "2025-01-20 15:30:45"; // Formato de la fecha

		LocalDateTime localDateTime = convertToLocalDateTime(dateStr);

		System.out.println("Cadena de fecha: " + dateStr);
		System.out.println("LocalDateTime: " + localDateTime);
	}

}
