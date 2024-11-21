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
            boolean isMayus = iChar == 'a' || iChar == 'e' || iChar == 'i' || iChar == 'o' || iChar == 'u';

            newText += isMayus ? Character.toUpperCase(iChar) : Character.toLowerCase(iChar);
        }

        System.out.println(newText);
    }
}
