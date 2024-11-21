/*
 * Exercici 14_13. Només lletres
 * Iker Rivera Garcia
 * 15/11/2024
 * Programa que une con "," las letras de un texto.
 */

public class NomesLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        String finalText = "";

        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);

            if (Character.isLetter(iChar)) {
                if (i > 0) {
                    finalText += ", " + iChar;
                }
                else {
                    finalText += iChar;
                }
            }
        }

        System.out.println(finalText);
    }    
}
