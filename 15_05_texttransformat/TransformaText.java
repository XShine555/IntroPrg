/*
 * Exercici 15_05. El text transformat
 * Iker Rivera Garcia
 * 22/11/2024
 * Transforma un texto basándose en las reglas de ejercicio.
 */

public class TransformaText {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();
        int textLen = userInput.length();

        String newText = "";
        for (int i = 0; i < textLen; i++) {
            char iChar = userInput.charAt(i);

            if (Character.isWhitespace(iChar)) {
                newText += iChar;
            }
            else if (Character.isLetter(iChar)) {
                char iLowerChar = Character.toLowerCase(iChar);
                if (iLowerChar == 'a' || iLowerChar == 'e' || iLowerChar == 'i' || iLowerChar == 'o'
                || iLowerChar == 'u' || iLowerChar == 'à' || iLowerChar == 'é' || iLowerChar == 'è'
                || iLowerChar == 'í' || iLowerChar == 'ï' || iLowerChar == 'ó' || iLowerChar == 'ò'
                || iLowerChar == 'ú' || iLowerChar == 'ü') {
                    newText += Character.toLowerCase(iChar);
                }
                else {
                    newText += Character.toUpperCase(iChar);
                }
            }
            else if (Character.isDigit(iChar)) {
                char lastChar = ' ';
                if (i > 0) {
                    lastChar = userInput.charAt(i - 1);
                }
                if (i < textLen - 1) {
                    char nextChar = userInput.charAt(i + 1);

                    if (!Character.isDigit(lastChar)) {
                        newText += "(";
                    }

                    newText += iChar;

                    if (!Character.isDigit(nextChar)) {
                        newText += ")";
                    }
                }
                else {
                    newText += iChar + ")";
                }
            }
        }
        System.out.println(newText);
    }}
