public class UtilString {
    private static int comptaParaules(String text, boolean inclouBlancs) {
        if (text.isBlank() || text.isEmpty())
            return 0;

        int wordsCount = 1;

        char previousChar = text.charAt(0);

        for (int i = 1; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isWhitespace(currentChar) && Character.isLetterOrDigit(previousChar)) {
                wordsCount++;
            } else if (Character.isLetterOrDigit(currentChar) && Character.isWhitespace(previousChar)) {
                if (inclouBlancs) {
                    wordsCount++;
                }
            }

            previousChar = currentChar;
        }

        return wordsCount;
    }

    // retorna la seqüència de subcadenes de text separades entre caràcters en
    // blanc, incloent els caracters en blanc quan inclouBlancs és cert
    public static String[] separa(String text, boolean inclouBlancs) {
        if (text.isBlank() || text.isEmpty())
            return new String[0];

        int wordsCount = comptaParaules(text, inclouBlancs);
        int index = 0;

        String[] words = new String[wordsCount];
        String textBuffer = "";

        char previousChar = text.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Si este caracter es un espacio en blanco y el anterior no lo era entonces ha habido un cambio de palabra.
            if (Character.isWhitespace(currentChar) && !Character.isWhitespace(previousChar)) {
                //Limpiamos el Buffer.
                words[index] = textBuffer;
                index++;
                textBuffer = "";
            }
            // Si este caracter es un caracter o un digito y el anterior no lo era entonces ha habido un cambio de palabra.
            else if (Character.isLetterOrDigit(currentChar) && !Character.isLetterOrDigit(previousChar)) {
                //Limpiamos el Buffer.
                if (inclouBlancs) {
                    words[index] = textBuffer;
                    index++;
                }
                textBuffer = "";
            }

            textBuffer += currentChar;

            previousChar = currentChar;
        }

        //System.out.println("Buffer: " + textBuffer + " Length: " + words.length + " Index: " + index + " WordsCount: " + wordsCount);

        if (!textBuffer.isBlank()) {
            words[index] = textBuffer;
        }

        return words;
    }
    // equival a separa(text, false)
    public static String[] separa(String text) {
        return separa(text, false);
    }
}