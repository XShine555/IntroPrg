/*
 * Exercici 11_07. Els dies de la setmana
 * 04/10/2024
 * Iker Rivera Garcia
 * Programa que dependiendo del número que introduzcas de argumento te devuelve el día de la semana basándose en una tabla, usando la estructura de un Switch.
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
		String dia;
		switch (num) {
			case 1:
				dia = "Dilluns";
				break;
			case 2:
				dia = "Dimarts";
				break;
			case 3:
				dia = "Dimecres";
				break;
			case 4:
				dia = "Dijous";
				break;
			case 5:
				dia = "Divendres";
				break;
			case 6:
				dia = "Dissabte";
				break;
			case 7:
				dia = "Diumenge";
				break;
			default:
				dia = "Error";
				break;
		}
		System.out.println(dia);
	}
}
