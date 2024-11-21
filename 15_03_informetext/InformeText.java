/*
 * Exercici 15_03. Estadístiques d'un text
 * Iker Rivera Garcia
 * 21/11/2024
 * Programa que muestra las estadísticas de un texto.
 */

public class InformeText {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        if (userInput.isBlank()) {
            System.out.println("Cadena buida");
        } else {
            int textLen = userInput.length();

            System.out.println("Informe");
            System.out.println("=======");

            int letterCount = 0, mayusCount = 0, minusCount = 0;
            int vowelCount = 0, vowelMayusCount = 0, vowelMinusCount = 0;
            int numberCount = 0, otherSymbols = 0;

            for (int i = 0; i < textLen; i++) {
                char iChar = userInput.charAt(i);

                if (Character.isLetter(iChar)) {
                    letterCount++;

                    if (Character.isLowerCase(iChar)) {
                        minusCount++;

                        if (iChar == 'a' || iChar == 'e' || iChar == 'i' || iChar == 'o'
                                || iChar == 'u' || iChar == 'à' || iChar == 'é' || iChar == 'è'
                                || iChar == 'í' || iChar == 'ï' || iChar == 'ó' || iChar == 'ò'
                                || iChar == 'ú' || iChar == 'ü') {
                            vowelMinusCount++;
                            vowelCount++;
                        }
                    } else {
                        mayusCount++;
                        if (iChar == 'A' || iChar == 'E' || iChar == 'I' || iChar == 'O'
                                || iChar == 'U' || iChar == 'À' || iChar == 'É' || iChar == 'È'
                                || iChar == 'Í' || iChar == 'Ï' || iChar == 'Ó' || iChar == 'Ò'
                                || iChar == 'Ú' || iChar == 'Ü') {
                            vowelMayusCount++;
                            vowelCount++;
                        }
                    }
                } else if (Character.isDigit(iChar)) {
                    numberCount++;
                } else {
                    otherSymbols++;
                }
            }

            System.out.format("lletres en majúscules: %d (%.2f%%)%n", mayusCount, 100.0 * mayusCount / textLen);
            System.out.format("lletres en minúscules: %d (%.2f%%)%n", minusCount, 100.0 * minusCount / textLen);
            System.out.format("total lletres: %d (%.2f%%)%n", letterCount, 100.0 * letterCount / textLen);
            System.out.format("vocals en majúscules: %d (%.2f%%)%n", vowelMayusCount,
                    100.0 * vowelMayusCount / textLen);
            System.out.format("vocals en minúscules: %d (%.2f%%)%n", vowelMinusCount,
                    100.0 * vowelMinusCount / textLen);
            System.out.format("total vocals: %d (%.2f%%)%n", vowelCount, 100.0 * vowelCount / textLen);
            System.out.format("digits: %d (%.2f%%)%n", numberCount, 100.0 * numberCount / textLen);
            System.out.format("altres caràcters: %d (%.2f%%)%n", otherSymbols, 100.0 * otherSymbols / textLen);
            System.out.format("total caràcters: %d", textLen);
        }
    }
}