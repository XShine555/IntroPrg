/*
 * Exercici 13_12. Un quadrat de nombres
 * Iker Rivera Garcia
 * 28/10/2024
 * Programa que pide un número del 1 al 9 y dibuja un cuadrado.
*/

public class QuadratNombres {
	public static void main(String[] args) {
		System.out.println("Valor final?");
		int value = Integer.parseInt(Entrada.readLine());

		if (value < 1 || value > 9) {
			System.out.println("Valor inadequat");
		}
		else {
			for (int i = 0; i < value; i++) {
				for (int j = 1; j <= value; j++) {
					System.out.print(" " + j);
				}
				System.out.println();
			}
		}
	}
}
