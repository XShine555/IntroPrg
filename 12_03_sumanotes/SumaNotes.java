/*
 * Exercici 12_03. Suma notes
 * Iker Rivera Garcia
 * 16/09/2024
 * Programa que te pedirá números infinitos hasta que pongas uno menor a 0 o superior a 100 y te mostrará la suma de los números que has puesto.
*/

public class SumaNotes {
	public static void main(String[] args) {
		int suma = 0, valor;
		System.out.println("Introdueix una nota");
		valor = Integer.parseInt(Entrada.readLine());
		while (valor >= 0 && valor <= 100) {
			suma += valor;
			System.out.println("Introdueix una nota");
			valor = Integer.parseInt(Entrada.readLine());
		}
		System.out.format("La suma de les notes vàlides és %s", suma);
	}
}
