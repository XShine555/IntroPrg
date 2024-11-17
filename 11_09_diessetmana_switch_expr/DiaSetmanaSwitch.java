/*
 * Exercici 11_07. Els dies de la setmana
 * 04/10/2024
 * Iker Rivera Garcia
 *Programa que dependiendo del número que introduzcas de argumento te devuelve el día de la semana basándose en una tabla, usando la estructura de Switch Expressions.
 * 1 -> Lunes
 * 2 -> Martes
 * 3 -> Miércoles
 * 4 -> Jueves
 * 5 -> Viernes
 * 6 -> Sábado
 * 7 -> Domingo
 * Otro -> Error
 */

public class DiaSetmanaSwitch {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String dia = switch (num) {
			case 1 -> "Dilluns";
			case 2 -> "Dimarts";
			case 3 -> "Dimecres";
			case 4 -> "Dijous";
			case 5 -> "Divendres";
			case 6 -> "Dissabte";
			case 7 -> "Diumenge";
			default -> "Error";
		};
		System.out.println(dia);
	}
}
