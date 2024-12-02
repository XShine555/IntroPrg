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

        String result = "";
        String tempString = "";

        for (int i = userInput.length() - 1; i > -1; i--) {
            char iChar = userInput.charAt(i);
            if (i == 0) {
                tempString += iChar;
            }

            if (Character.isWhitespace(iChar) || i == 0) {
                String thisResult = "";
                for (int j = 0; j < tempString.length(); j++) {
                    thisResult += tempString.charAt(j);
                }
                tempString = "";
                if (result.length() > 0)
                    result = " " + result;
                result = thisResult + result;
            } else {
                tempString += iChar;
            }
        }

        System.out.println(result);
    }    
}
