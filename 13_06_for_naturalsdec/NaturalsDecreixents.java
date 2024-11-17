/*
 * Exercici 13_06. Els primers naturals decreixentment novament
 * Iker Rivera Garcia
 * 25/10/2024
 * Cuenta del 10 al 1 con un bucle for.
*/

public class NaturalsDecreixents {
	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		if (value < 1) {
			System.out.format("Cap valor decreixent entre %s i 1", value);
		}
		else {
			for (int i = value; i > 0; i--) {
				System.out.println(i);
			}
		}
	}
}
