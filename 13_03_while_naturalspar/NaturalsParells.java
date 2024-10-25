/*
 * Exercici 13_03. Els primers parells
 * Iker Rivera Garcia
 * 25/10/2024
 * Programa que cuenta del 0 al X con números par.
*/

public class NaturalsParells {
	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		int thisValue = 0;
		if (value < 1) {
			System.out.format("Cap valor parell creixent entre 1 i %s", value);
		}
		else if (value % 2 == 0) {
			while (thisValue < value) {
				thisValue += 2;
				System.out.println(thisValue);
			}
		}
	}
}
