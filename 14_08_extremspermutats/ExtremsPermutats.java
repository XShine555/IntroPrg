/*
 * Exercici 14_08. Extrems permutats
 * Iker Rivera Garcia
 * 15/11/2024
 * Programa que repetirá palabras permutadas de las letras de los extremos.
*/

public class ExtremsPermutats {
	public static void main(String[] args) {
		System.out.println("Ves introduïnt texts (finalitza amb INTRO sol)");
		String userInput = Entrada.readLine();

		while (!userInput.isBlank()) {
			int inputLength = userInput.length();

			if (inputLength > 1) {
				char firstChar1 = Character.toUpperCase(userInput.charAt(0));
				char firstChar2 = Character.toUpperCase(userInput.charAt(1));

				char lastChar1 = Character.toUpperCase(userInput.charAt(inputLength - 2));
				char lastChar2 = Character.toUpperCase(userInput.charAt(inputLength - 1));

				if (Character.isLetter(firstChar1) && Character.isLetter(firstChar2) &&
						Character.isLetter(firstChar1) && Character.isLetter(firstChar2)) {

					if ((firstChar1 == lastChar1 && firstChar2 == lastChar2)
							|| (firstChar1 == lastChar2 && firstChar2 == lastChar1)) {
						System.out.format("Repeteix: %s%n", userInput);
					}
				}
			}

			userInput = Entrada.readLine();
		}
		System.out.println("Adéu");
	}
}