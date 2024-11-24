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
				/*String firstSection = "";
				for (int i = 0; i < 2; i++) {
					firstSection += Character.toUpperCase(userInput.charAt(i));
				}
				String lastSection = "";
				for (int i = inputLength - 2; i < inputLength; i++) {
					lastSection += Character.toUpperCase(userInput.charAt(i));
				}

				if (Character.isLetter(firstSection.charAt(0)) && Character.isLetter(firstSection.charAt(1)) &&
						Character.isLetter(lastSection.charAt(0)) && Character.isLetter(lastSection.charAt(1))) {

					String rotateLastSection = "";
					for (int i = lastSection.length() - 1; i > -1; i--) {
						rotateLastSection += Character.toUpperCase(lastSection.charAt(i));
					}

					boolean isEqual = true;
					for (int i = 0; i < rotateLastSection.length(); i++) {
						char firstChar = firstSection.charAt(i);
						char secondChar = lastSection.charAt(i);
						char secondReversedChar = rotateLastSection.charAt(i);
						if (firstChar != secondReversedChar || firstChar != secondChar){
							isEqual = false;
						}
					}

					if (!isEqual) {
						System.out.format("Repeteix: %s%n", userInput);
					}
				}*/

				char firstChar1 = Character.toUpperCase(userInput.charAt(0));
				char firstChar2 = Character.toUpperCase(userInput.charAt(1));

				char lastChar1 = Character.toUpperCase(userInput.charAt(inputLength - 2));
                char lastChar2 = Character.toUpperCase(userInput.charAt(inputLength - 1));

				if (Character.isLetter(firstChar1) && Character.isLetter(firstChar2) &&
					Character.isLetter(firstChar1) && Character.isLetter(firstChar2)) {

				if ( (firstChar1 == lastChar1 && firstChar2 == lastChar2) || (firstChar1 == lastChar2 && firstChar2 == lastChar1) ) {
					System.out.format("Repeteix: %s%n", userInput);
				}
			}}

			userInput = Entrada.readLine();
		}
		System.out.println("Adéu");
	}
}
