/*
 * Exercici 17_11. És enter (flexible)
 * Iker Rivera Garcia
 * Clase que proporciona métodos para Strings.
 */

public class UtilString {
    public static boolean esEnter(String text) {
        if (text.isBlank() || text.isEmpty())
            return false;

        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);

            boolean isSymbol = iChar == '+' || iChar == '-' || iChar == '*' || iChar == '/' || iChar == '%';

            if (isSymbol && i == text.length() - 1) {
                return false;
            } else if (!Character.isDigit(iChar) && !isSymbol) {
                return false;
            } else if (i > 0) {
                char lastChar = text.charAt(i - 1);
                boolean isLastCharSymbol = lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/'
                        || lastChar == '%';

                if (isLastCharSymbol && isSymbol) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean esEnter(String text, boolean estricte) {
        if (estricte)
            return esEnter(text);

        text = replaceChar(text, ' ', "");
        
        if (text.isBlank() || text.isEmpty())
            return false;

        int textLen = text.length();
        for (int i = 0; i < textLen; i++) {
            char iChar = text.charAt(i);
            if (Character.isWhitespace(iChar)) {
                return false;
            }

            boolean isSymbolOrInvalid = (iChar == '+' || iChar == '-' || iChar == '*' || iChar == '/'
                || iChar == '%'
                || iChar == '.' || iChar == '_') || Character.isLetter(iChar);
            // Sí hay un símbolo al al final.
            if (i == textLen - 1 && isSymbolOrInvalid) {
                return false;
            }
            // Si es un símbolo comprobar que no tenga duplicados y sea válido.
            else if (i > 0) {
                char priorChar = text.charAt(i - 1);
                boolean isPriorSymbol = (priorChar == '+' || priorChar == '-' || priorChar == '*'
                        || priorChar == '/' || priorChar == '%'
                        || priorChar == '.' || priorChar == '_') || Character.isLetter(iChar);
                if (isSymbolOrInvalid && isPriorSymbol) {
                    return false;
                }
            }
            // En caso de que empiece por "." O "-" es inválido.
            else if (iChar == '.' || iChar == '_' || Character.isLetter(iChar)) {
                return false;
            }
        }
        
        return true;
    }

    public static int aEnter(String text, boolean estricte) {
        if (esEnter(text, false) && !estricte) {
            text = replaceChar(text, ' ', "");
            text = replaceChar(text, '.', "");
            text = replaceChar(text, '_', "");

            return Integer.parseInt(text);
        }

        return Integer.parseInt(text);
    }

    public static String replaceChar(String text, char character, String toReplace) {
        String newText = "";
        if (text.isEmpty() || text.isBlank())
            return newText;
        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);
            if (iChar == character)
                newText += toReplace;
            else
                newText += iChar;
        }

        return newText;
    }
}