/*
 * Exercici 13_05. Els primers naturals novament
 * Iker Rivera Garcia
 * 25/10/2024
 * Cuenta del 1 al 10 con un bucle for.
*/

public class Naturals {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if (num < 1) {
			System.out.format("Cap valor creixent entre 1 i %s", num);
		}
		else {
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}
		}
	}
}
