/*
 * Exercici 12_06. Troba el màxim
 * Iker Rivera Garcia
 * 28/10/2024
 * Programa que pide números positivos hasta que introduces uno negativo y mostrara el número introducido positivo más grande
*/

public class TrobaMaxim {
	public static void main(String[] args) {
		int maxValue = 0;

		System.out.println("Introdueix un valor");
		int value = Integer.parseInt(Entrada.readLine());

		while (value >= 0) {
			if (value > maxValue) {
				maxValue = value;
			}
			System.out.println("Introdueix un valor");
			value = Integer.parseInt(Entrada.readLine());
		}
		System.out.println("El màxim és " + maxValue);
	}
}
