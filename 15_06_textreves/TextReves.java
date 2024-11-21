/*
 * Exercici 15_06. El text del revés
 * Iker Rivera Garcia
 * 22/11/2024
 * Invierte el texto introducido.
 */

public class TextReves {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();
        int textLen = userInput.length();

        for (int i = textLen - 1; i >= 0; i--) {
            System.out.print(userInput.charAt(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }    
}
