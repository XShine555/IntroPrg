/*
 * Exercici 17_09. Secció d'un String (modular)
 * Iker Rivera Garcia
 * Clase que proporciona métodos para Strings.
 */

public class UtilString {
    public static String intervalString(String text, int start, int end) {
        String result  = "";
        int textLen = text.length();

        start = Math.max(0, Math.min(textLen - 1, start));
        end = Math.max(0, Math.min(textLen - 1, end));

        if (start > end) {
            for (int i = start; i >= end; i--) {
                result += text.charAt(i);
            }
        } else {
            for (int i = start; i <= end; i++) {
                result += text.charAt(i);
            }
        }

        return result;
    }
}
