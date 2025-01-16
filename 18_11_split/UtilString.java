public class UtilString {
    // retorna la seqüència de subcadenes de text separades entre caràcters en
    // blanc, incloent els caracters en blanc quan inclouBlancs és cert
    public static String[] separa(String text, boolean inclouBlancs) {
        if (text.isBlank() || text.isEmpty())
            return new String[0];

        int wordsCount = 0;
        boolean wasLetterOrDigit = false;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isWhitespace(currentChar) && wasLetterOrDigit) {
                if (inclouBlancs)
                    wordsCount++;
                wasLetterOrDigit = false;
            }
            else if (Character.isLetterOrDigit(currentChar) && !wasLetterOrDigit) {
                wordsCount++;
                wasLetterOrDigit = true;
            }
        }

        int index = 0;
        int sum = inclouBlancs ? 1 : 0;

        String[] words = new String[wordsCount + sum];
        String textBuffer = "";

        char previousChar = text.charAt(0);

        for (int i = 0; i < text.length() + 1; i++) {
            if (i > text.length() - 1) {
                words[index] = textBuffer;
                break;
            }

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

        return words;
    }
    // equival a separa(text, false)
    public static String[] separa(String text) {
        return separa(text, false);
    }
}