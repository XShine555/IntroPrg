/*
 * Exercici 12_08. Estadístiques
 * Iker Rivera Garcia
 * 27/10/2024
 * Programa que pide números hasta que introduzcas uno negativo y calcula el mínimo, la media y el máximo.
*/

public class Estadistiques {
	public static void main(String[] args) {
		double contador = 0;

		System.out.println("Introdueix un valor");
		int valor = Integer.parseInt(Entrada.readLine());
		int min = 0, max = 0, total = 0;

		if (valor >= 0) {
			min = valor;
			max = valor;
			total = valor;
			contador++;
			while (valor >= 0) {
				System.out.println("Introdueix un valor");
				valor = Integer.parseInt(Entrada.readLine());

				if (valor >= 0) {
					if (valor < min) {
						min = valor;
					}
					if (valor > max) {
						max = valor;
					}
					total += valor;
					contador++;
				}
			}
		}

		if (contador == 0) {
			System.out.println("Cap valor vàlid introduït");
		}
		else {
			System.out.println("El mínim és: " + min);
			System.out.println("La mitjana és: " + total / contador);
			System.out.println("El màxim és: " + max);
		}
	}
}
