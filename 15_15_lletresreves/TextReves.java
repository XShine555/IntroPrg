/*
 * Exercici 15_15. Les lletres del revés
 * Iker Rivera Garcia
 * 2/11/2024
 * Programa que intercambia las letras a las del final de un texto ignorando caracteres especiales.
 */

public class TextReves {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        String finalText = "";
        int oppositeIndex = userInput.length() - 1;
    
        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);

            if (!Character.isLetterOrDigit(currentChar))
                finalText += currentChar;
            else {
                char oppositeChar = userInput.charAt(oppositeIndex);
                while (!Character.isLetterOrDigit(oppositeChar)) {
                    oppositeIndex--;
                    oppositeChar = userInput.charAt(oppositeIndex);
                }
                finalText += userInput.charAt(oppositeIndex);
                oppositeIndex--;
            }
        }

        System.out.println(finalText);
    }    
}
