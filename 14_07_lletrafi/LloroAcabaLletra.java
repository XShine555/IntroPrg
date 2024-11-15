/*
 * Exercici 14_07. Acaba amb lletra no vocal
 * Iker Rivera Garcia
 * 15/11/2024
 * Programa que repite la palabra que digas si no acaba en vocal.
*/

public class LloroAcabaLletra  {
	public static void main(String[] args) {
                System.out.println("Paraula?");
                String userInput = Entrada.readLine();

                while (!userInput.isBlank()) {
			String upper = userInput.toUpperCase();
			char searchChar = Character.MIN_VALUE;
			for (int i = upper.length() - 1; i > 0; i--) {
				char thisChar = upper.charAt(i);
				if (Character.isLetter(thisChar)) {
					searchChar = thisChar;
					break;
				}
			}
			if (searchChar != Character.MIN_VALUE) {
				String lastChar = String.valueOf(searchChar);
				if (!lastChar.endsWith("A") && !lastChar.endsWith("E") && !lastChar.endsWith("I") && !lastChar.endsWith("O") && !lastChar.endsWith("U")) {
					System.out.format("Repeteixo: %s%n", userInput);
				}
			}

                        System.out.println("Paraula?");
                        userInput = Entrada.readLine();
                }
                System.out.println("Adéu");
	}
}
