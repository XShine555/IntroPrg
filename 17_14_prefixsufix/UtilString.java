public class UtilString {
    // retorna cert quan text comença amb prefix, considerant si ha de ser o no extricte
    public static boolean esPrefix(String text, String prefix, boolean extricte) {
        if (text.isEmpty() || text.isBlank()) 
            return false;
        if (prefix.isEmpty() || prefix.isBlank()) 
            return true;

        if (prefix.length() > text.length())
            return false;

        for (int i = 0; i < prefix.length(); i++) {
            char iChar = text.charAt(i);
            char prefixChar = prefix.charAt(i);

            if (!extricte) {
                iChar = charToNormal(iChar);
                prefixChar = charToNormal(prefixChar);
            }

            if (iChar != prefixChar)
                return false;
        }

        return true;
    }
    // equival a esPrefix(text, prefix, true)
    public static boolean esPrefix(String text, String prefix) {
        return esPrefix(text, prefix);
    }

    // retorna cert quan text finalitza amb sufix, considerant si ha de ser o no extricte
    public static boolean esSufix(String text, String sufix, boolean extricte) {
        if (text.isEmpty() || text.isBlank()) 
            return false;
        if (sufix.isEmpty() || sufix.isBlank()) 
            return true;

        if (sufix.length() > text.length())
            return false;

        for (int i = text.length() - sufix.length(); i < sufix.length(); i++) {
            char iChar = text.charAt(i);
            char prefixChar = sufix.charAt(i);

            if (!extricte) {
                iChar = charToNormal(iChar);
                prefixChar = charToNormal(prefixChar);
            }

            if (iChar != prefixChar)
                return false;
        }

        return true;
    }
    // equival a esSufix(text, sufix, true)
    public static boolean esSufix(String text, String sufix) {
        return esSufix(text, sufix);
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
