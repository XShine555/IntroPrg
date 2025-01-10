public class UtilString {
    public static boolean esCreixent(String text) {
        int lastIndex = (int) text.charAt(0);

        for (int i = 1; i < text.length(); i++) {
            char iChar = text.charAt(i);

            if (!Character.isLetter(iChar)) {
                continue;
            }

            if (lastIndex > (int) iChar) {
                return false;
            }

            lastIndex = (int) iChar;
        }

        return true;
    }
    
    public static boolean esCreixent(String text, boolean estricta) {
        String sanitizedText = text;

        if (!estricta) {
            sanitizedText = "";
            for (int i = 0; i < text.length(); i++) {
                sanitizedText += charToNormal(text.charAt(i));
            }
        }

       return esCreixent(sanitizedText);
    }

    public static boolean esDecreixent(String text) {
        int lastIndex = (int) text.charAt(0);

        for (int i = 1; i < text.length(); i++) {
            char iChar = text.charAt(i);

            if (!Character.isLetter(iChar)) {
                continue;
            }

            if (lastIndex < (int) iChar) {
                return false;
            }

            lastIndex = (int) iChar;
        }

        return true;
    }

    public static boolean esDecreixent(String text, boolean estricta) {
        String sanitizedText = text;

        if (!estricta) {
            sanitizedText = "";
            for (int i = 0; i < text.length(); i++) {
                sanitizedText += charToNormal(text.charAt(i));
            }
        }

        return esDecreixent(sanitizedText);
    }

    public static boolean esCreixiDecri(String text) {
        return esCreixiDecri(text, true);
    }

    public static boolean esCreixiDecri(String text, boolean estricta) {
        text = textToNormal(text);
        if (text.length() < 3) return false;

        char lastChar = text.charAt(0);
        boolean creixent = false, decreixent = false;

        for (int i = 1; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Si la primera no es creixent no es valido.
            if (i > 1 && !creixent)
                break;

            if ((int)lastChar < (int)currentChar) {
                creixent = true;
            } else {
                // Si hay una creixent antes que una creixent no es valido.
                if (!creixent)
                    break;

                decreixent = true;
            }

            lastChar = currentChar;
        }

        return creixent && decreixent;
    }

    public static boolean esDecriCreixi(String text) {
        return esDecriCreixi(text, true);
    }

    public static boolean esDecriCreixi(String text, boolean estricta) {
        text = textToNormal(text);
        if (text.length() < 3) return false;

        char lastChar = text.charAt(0);
        boolean creixent = false, decreixent = false;

        for (int i = 1; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Si la primera no es decreixent no es valido.
            if (i > 1 && !decreixent)
                break;

            if ((int)lastChar > (int)currentChar) {
                decreixent = true;
            } else {
                // Si hay una creixent antes que una decreixent no es valido.
                if (!decreixent)
                    break;

                creixent = true;
            }

            lastChar = currentChar;
        }

        return creixent && decreixent;
    }

    public static String textToNormal(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            char normalChar = charToNormal(text.charAt(i));
            if ((int)normalChar >= 97 && (int)normalChar <= 122)
                newText += charToNormal(text.charAt(i));
        }
        return newText;
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
                case 'ë':
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