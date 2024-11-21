/*
 * Exercici 15_07. Texts capicua
 * Iker Rivera Garcia 
 * 22/11/2024
 * Determina si un texto de capicúa o no.
 */

public class Capicua {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        String reverseUserInput = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reverseUserInput += userInput.charAt(i);
        }

        System.out.println(userInput.equalsIgnoreCase(reverseUserInput) ? "És capicua" : "No és capicua");
    }    
}
