/*
 * Exercici 17_10. És enter (modular)
 * Iker Rivera Garcia
 * Clase que proporciona métodos para Strings.
 */

public class UtilString {
    public static boolean esEnter(String text) {
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
}
