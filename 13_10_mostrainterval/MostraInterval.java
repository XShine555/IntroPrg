/*
 * Exercici 13_10. Enters dins d'un interval
 * Iker Rivera Garcia
 * 25/10/2024
 * Programa que pedirá dos número y si el número 1 es más grande que el segundo contara del número 1 al número 2 y si no al revés.
*/

public class MostraInterval {
	public static void main(String[] args) {
		System.out.println("inici?");
		int firstNum = Integer.parseInt(Entrada.readLine());

		System.out.println("final?");
		int secondNum = Integer.parseInt(Entrada.readLine());

		boolean inReverse = firstNum > secondNum;

		if (inReverse) {
			for (int i = firstNum; i >= secondNum; i--) {
				System.out.println(i);
			}
		}
		else {
			for (int i = firstNum; i <= secondNum; i++) {
				System.out.println(i);
			}
		}
	}
}
