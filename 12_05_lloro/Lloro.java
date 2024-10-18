/*
 * Exercici 12_05. El lloro
 * Iker Rivera Garcia
 * 18/10/2024
 * Programa que repetirá todo lo que introduzcas hasta que introduzcas un texto en blanco o vacía.
*/
public class Lloro {
	public static void main(String[] args) {
		for (; ;) {
			System.out.println("El lloro espera paraula:");
			String input = Entrada.readLine();
			if (input.isBlank()) {
				break;
			}
			System.out.println("El lloro repeteix: " + input);
		}
		System.out.println("Adéu");
	}
}
