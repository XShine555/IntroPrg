/*
 * Exercici 15_01. Vocals en majúscules
 * Iker Rivera Garcia
 * 21/11/2024
 * Programa que contará las vocales.
 */

public class ComptaVocals {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        int vowelCount = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char iChar = userInput.charAt(i);
            char iUpperChar = Character.toUpperCase(iChar);

            if (iUpperChar == 'A' || iUpperChar == 'E' || iUpperChar == 'I' || iUpperChar == 'O'
                    || iUpperChar == 'U' || iUpperChar == 'À' || iUpperChar == 'É' || iUpperChar == 'È'
                    || iUpperChar == 'Í' || iUpperChar == 'Ï' || iUpperChar == 'Ó' || iUpperChar == 'Ò'
                    || iUpperChar == 'Ú' || iUpperChar == 'Ü')
                vowelCount++;
        }

        System.out.println(vowelCount);
    }
}
