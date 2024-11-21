/*
 * Exercici 15_01. Vocals en majúscules
 * Iker Rivera Garcia
 * 21/11/2024
 * Programa que convertirá las vocales en mayúscula.
 */

public class VocalsMajuscules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        String newText = "";
        for (int i = 0; i < userInput.length(); i++) {
            char iChar = userInput.charAt(i);
            char iUpperChar = Character.toUpperCase(iChar);
            boolean isMayus = iUpperChar == 'A' || iUpperChar == 'E' || iUpperChar == 'I' || iUpperChar == 'O'
                    || iUpperChar == 'U';

            newText += isMayus ? iUpperChar : Character.toLowerCase(iChar);
        }

        System.out.println(newText);
    }
}
