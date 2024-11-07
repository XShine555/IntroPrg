/*
 * Exercici 13_14. Un triangle invertit
 * Iker Rivera Garcia
 * 07/11/2024
 * Programa que cuenta del número que se haya introducido al 1.
*/

public class TriangleInvertit {
	public static void main(String[] args) {
		System.out.println("Nombre?");
		int value = Integer.parseInt(Entrada.readLine());

		if (value < 1 || value > 9) {
			System.out.println("Valor inadequat");
		}
		else {
			for (int i = value; i > 0; i--) {
				for (int j = 1; j <= i; j++) {
					if (j == i) {
						System.out.print(j);
					}
					else {
						System.out.print(j + ", ");
					}
				}
			System.out.println();
			}
		}
	}
}
