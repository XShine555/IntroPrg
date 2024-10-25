/*
 * Exercici 13_02. Els primers naturals
 * Iker Rivera Garcia
 * 25/10/2024
 * Programa que cuenta del 10 al 1.
*/

public class NaturalsDecreixents {
	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		if (value < 1) {
			System.out.format("Cap valor decreixent entre %s i 1", value);
		}
		else {
			while (value > 0) {
				System.out.println(value);
				value--;
			}
		}
	}
}
