/*
 * Exercici 17_13. Substrings
 * Iker Rivera Garcia
 * Clase que proporciona métodos para Strings.
 */

public class UtilString {
    // retorna cert quan subtext està inclòs extrictament dins de text
    public static boolean esSubstring(String text, String subtext, boolean extricte) {
        if (text.isEmpty() || text.isBlank())
            return false;
        if (subtext.isEmpty() || subtext.isBlank())
            return true;

        for (int index = 0; index < text.length(); index++) {
            if (index + subtext.length() > text.length()) {
                return false;
            }

            int count = 0;
            for (int child = 0; child < subtext.length(); child++) {
                char indexChar = text.charAt(index + child);
                char childChar = subtext.charAt(child);

                if (!extricte) {
                    indexChar = UtilString.charToNormal(indexChar);
                    childChar = UtilString.charToNormal(childChar);
                }

                if (indexChar != childChar)
                    break;
                else
                    count++;
            }

            if (count == subtext.length())
                return true;
        }

        return false;
    }
    // equival a esSubstring(text, subtext, true)
    public static boolean esSubstring(String text, String subtext) {
        return esSubstring(text, subtext, true);
    }

    public static Character charToNormal(char character) {
        if (Character.isLetter(character)) {
            character = Character.toLowerCase(character);

            switch (character) {
                case 'à':
                case 'á':
                    return 'a';
                case 'è':
                case 'é':
                    return 'e';
                case 'ì':
                case 'í':
                case 'ï':
                    return 'i';
                case 'ò':
                case 'ó':
                case 'ö':
                    return 'o';
                case 'ù':
                case 'ú':
                case 'ü':
                    return 'u';
                case 'ñ':
                    return 'n';
                case 'ç':
                    return 'c';
                default:
                    return character;
            }
        }
        return character;
    }
}
