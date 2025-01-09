public class UtilString {
    // retorna el nombre d'aparicions del subtext dins del text, considerant si
    // ha de ser o no extricte
    public static int quants(String text, String subtext, boolean extricte) {
        int count = 0;

        if (text.isEmpty() || text.isBlank())
            return 0;

        if (subtext.isEmpty() || subtext.isBlank())
            return 0;

        if (subtext.length() > text.length())
            return 0;

        for (int index = 0; index < text.length(); index++) {
            if (index + subtext.length() > text.length()) {
                return 0;
            }

            int chars = 0;
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
                chars++;
            }

            if (chars == subtext.length())
                count++;

        }

        return count;
    }

    // equival a quants(text, subtext, true)
    public static int quants(String text, String subtext) {
        return quants(text, subtext);
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