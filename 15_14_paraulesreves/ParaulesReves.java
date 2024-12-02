/*
 * Exercici 15_14. Paraules del revés
 * Iker Rivera Garcia
 * 2/11/2024
 * Programa que pone las palabras del revés de un texto.
 */

public class ParaulesReves {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        String sanitizedText = "";
        String reversedString = "";
        String temporalWord = "";

        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);
            if (Character.isLetterOrDigit(currentChar) || Character.isWhitespace(currentChar)) {
                sanitizedText += currentChar;
            }
        }

        for (int i = 0; i < sanitizedText.length(); i++) {
            char currentChar = sanitizedText.charAt(i);

            if (Character.isLetterOrDigit(currentChar)) {
                temporalWord += currentChar;
            }

            if (Character.isWhitespace(currentChar) || i == sanitizedText.length() - 1) {
                for (int j = temporalWord.length() - 1; j >= 0; j--) {
                    reversedString += temporalWord.charAt(j);
                }

                temporalWord = "";
            }
        }

        String finalOutput = "";
        int reversedIndex = 0;

        for (int i = 0; i < userInput.length(); i++) {
            char originalChar = userInput.charAt(i);

            if (Character.isLetterOrDigit(originalChar)) {
                finalOutput += reversedString.charAt(reversedIndex);
                reversedIndex++;
            } else {
                finalOutput += originalChar;
            }
        }

        System.out.println(finalOutput);
    }    
}
