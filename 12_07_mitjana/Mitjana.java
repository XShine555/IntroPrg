/*
 * Exercici 12_07. La nota mitjana
 * Iker Rivera Garcia
 * 28/10/2024
 * Programa que suma las notas de los alumnos y devuelve una media de los números válidos
*/

public class Mitjana {
	public static void main(String[] args) {
		float contador = 0;
		int total = 0;

		System.out.println("Introdueix un valor");
		int value = Integer.parseInt(Entrada.readLine());

		while (value >= 0 && value <= 100) {
			contador++;
			total += value;

			System.out.println("Introdueix un valor");
			value = Integer.parseInt(Entrada.readLine());
		}

		if (contador == 0) {
			System.out.println("Cap nota vàlida introduïda");
		}
		else {
			System.out.format("La mitjana de les notes vàlides és %s", total / contador);
		}
	}
}
