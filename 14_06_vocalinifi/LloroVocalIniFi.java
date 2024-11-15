/*
 * Exercici 14_06. Inicia i acaba en vocal
 * Iker Rivera Garcia
 * 15/11/2024
 * Programa que repetirá la palabra que digas si empieza y acaba por vocal.
*/

public class LloroVocalIniFi  {
	public static void main(String[] args) {
                System.out.println("Paraula?");
                String userInput = Entrada.readLine();

                while (!userInput.isBlank()) {
			String upper = userInput.toUpperCase();
			char vocal = upper.charAt(0);
			boolean esVocal = vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U';
			if (esVocal && upper.endsWith(String.valueOf(vocal))) {
				System.out.format("Repeteixo: %s%n", userInput);
			}

                        System.out.println("Paraula?");
                        userInput = Entrada.readLine();
                }
                System.out.println("Adéu");
	}
}
