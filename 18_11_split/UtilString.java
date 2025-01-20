/*
 * Classe que proporciona mètodes per a Strings.
 */

public class UtilString {
    private static int comptaParaules(String text, boolean inclouBlancs) {
        if (text.isEmpty())
            return 0;

        int wordsCount = 0;

        char previousChar = text.charAt(0);
        String textBuffer = "";

        for (int i = 1; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isWhitespace(currentChar) && Character.isLetterOrDigit(previousChar)) {
                wordsCount++;
                textBuffer = "";
            } else if (Character.isLetterOrDigit(currentChar) && Character.isWhitespace(previousChar)) {
                if (inclouBlancs) {
                    wordsCount++;
                }
                textBuffer = "";
            }

            if (inclouBlancs && Character.isWhitespace(currentChar)) {
                textBuffer += currentChar;
            }
            else if (Character.isLetterOrDigit(currentChar))
                textBuffer += currentChar;

            previousChar = currentChar;
        }

        if (textBuffer.length() > 0)
            wordsCount++;

        return wordsCount;
    }

    // retorna la seqüència de subcadenes de text separades entre caràcters en
    // blanc, incloent els caracters en blanc quan inclouBlancs és cert
    public static String[] separa(String text, boolean inclouBlancs) {
        if (text.isEmpty())
            return new String[0];

        int wordsCount = comptaParaules(text, inclouBlancs);
        int index = 0;

        String[] words = new String[wordsCount];
        String textBuffer = "";

        char previousChar = text.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isWhitespace(currentChar) && Character.isLetterOrDigit(previousChar)) {
                //Limpiamos el Buffer.
                words[index] = textBuffer;
                index++;
                textBuffer = "";
            }
            else if (Character.isLetterOrDigit(currentChar) && Character.isWhitespace(previousChar)) {
                //Limpiamos el Buffer.
                if (inclouBlancs) {
                    words[index] = textBuffer;
                    index++;
                }
                textBuffer = "";
            }

            if (inclouBlancs && Character.isWhitespace(currentChar)) {
                textBuffer += currentChar;
            }
            else if (Character.isLetterOrDigit(currentChar))
                textBuffer += currentChar;

            previousChar = currentChar;
        }

        //System.out.println("Buffer: " + textBuffer + " Length: " + words.length + " Index: " + index + " WordsCount: " + wordsCount);

        if (textBuffer.length() > 0) {
            words[index] = textBuffer;
        }

        return words;
    }
    // equival a separa(text, false)
    public static String[] separa(String text) {
        return separa(text, false);
    }
}