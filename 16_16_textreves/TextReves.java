/*
 * Exercici 16_16. El text del revés
 * Iker Rivera Garcia
 * 09/12/2024
 * Invierte el texto introducido.
 */

public class TextReves {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        mostraReves(userInput);
    }    

    public static void mostraReves(String text) {
        int textLen = text.length();

        for (int i = textLen - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
