/*
 * Exercici 13_13. Un triangle de nombres
 * Iker Rivera Garcia
 * 28/10/2024
 * Programa que contara del 1 hasta el número que has puesto.
*/

public class TriangleNombres {
	public static void main(String[] args) {
		System.out.println("Nombre?");
		int value = Integer.parseInt(Entrada.readLine());

		if (value < 1 || value > 9) {
			System.out.println("Valor inadequat");
		}
		else {
			for (int i = 1; i <= value; i++) {

				for (int j = i; j > 0; j--) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}
}
