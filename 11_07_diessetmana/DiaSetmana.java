/*
 * Exercici 11_07. Els dies de la setmana
 * 04/10/2024
 * Iker Rivera Garcia
 *Programa que dependiendo del número que introduzcas de argumento te devuelve el día de la semana basándose en una tabla.
 * 1 -> Lunes
 * 2 -> Martes
 * 3 -> Miércoles
 * 4 -> Jueves
 * 5 -> Viernes
 * 6 -> Sábado
 * 7 -> Domingo
 * Otro -> Error
 */

public class DiaSetmana {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String dia = "Error";

		if (num == 1) {
			dia = "Dilluns";
		} else if (num == 2) {
			dia = "Dimarts";
		} else if (num == 3) {
			dia = "Dimecres";
		} else if (num == 4) {
			dia = "Dijous";
		} else if (num == 5) {
			dia = "Divendres";
		} else if (num == 6) {
			dia = "Dissabte";
		} else if (num == 7) {
			dia = "Diumenge";
		}

		System.out.println(dia);
	}
}
