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

			if (userInput.length() > 1) {
				String firstSection = userInput.substring(0, 2);
				String lastSection = userInput.substring(inputLength - 2);

        			if (Character.isLetter(firstSection.charAt(0)) && Character.isLetter(firstSection.charAt(1)) &&
            			Character.isLetter(lastSection.charAt(0)) && Character.isLetter(lastSection.charAt(1))) {

					String rotateLastSection = "";
					for (int i = lastSection.length() - 1; i > -1; i--) {
						rotateLastSection += lastSection.charAt(i);
					}

					if (firstSection.equalsIgnoreCase(lastSection) || firstSection.equalsIgnoreCase(rotateLastSection)) {
						System.out.format("Repeteix: %s%n", userInput);
					}
				}

			}

			userInput = Entrada.readLine();
		}
		System.out.println("Adéu");
	}
}
