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
			char lastChar = upper.charAt(upper.length() - 1);

			if (Character.isLetter(lastChar) && lastChar != 'A' && lastChar != 'E' && lastChar != 'I' && lastChar != 'O' && lastChar != 'U') {
				System.out.format("Repeteixo: %s%n", userInput);
			}

                        System.out.println("Paraula?");
                        userInput = Entrada.readLine();
                }
                System.out.println("Adéu");
	}
}
