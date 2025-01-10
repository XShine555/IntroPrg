public class UtilString {
    public static boolean esCreixent(String text) {
        return esCreixent(text, false);
    }
    
    public static boolean esCreixent(String text, boolean estricta) {
        String sanitizedText = estricta ? textToNormal(text) : textToLower(textToNormal(text));

        if (sanitizedText.length() < 3) return false;

        int lastIndex = (int) sanitizedText.charAt(0);

        for (int i = 1; i < sanitizedText.length(); i++) {
            char iChar = sanitizedText.charAt(i);

            if (!estricta && lastIndex == (int)iChar)
                return false;
            if (lastIndex > (int) iChar) {
                return false;
            }

            lastIndex = (int) iChar;
        }

        return true;
    }

    public static boolean esDecreixent(String text) {
        return esDecreixent(text, false);
    }

    public static boolean esDecreixent(String text, boolean estricta) {
        String sanitizedText = estricta ? textToNormal(text) : textToLower(textToNormal(text));;

        if (sanitizedText.length() < 3) return false;

        int lastIndex = (int) sanitizedText.charAt(0);

        for (int i = 1; i < sanitizedText.length(); i++) {
            char iChar = sanitizedText.charAt(i);

            if (!estricta && lastIndex == (int)iChar) 
                return false;
            if (lastIndex < (int) iChar) {
                return false;
            }

            lastIndex = (int) iChar;
        }

        return true;
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

            // Si despues de 1 no es creixent es invalido.
            if (i > 1 && !creixent) {
                return false;
            }

            if ((int)lastChar == (int)currentChar) {
                if (estricta)
                    return false;
                creixent = true;
            }
            else if ((int)lastChar < (int)currentChar) {
                if (creixent && decreixent)
                    return false;

                creixent = true;
            }
            else {
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

            // Si despues de 1 no es decreixent es invalido.
            if (i > 1 && !decreixent)
                return false;

            if (estricta && (int)lastChar == (int)currentChar)
                return false;

            if ((int)lastChar > (int)currentChar) {
                if (decreixent && creixent)
                    return false;

                decreixent = true;
            }
            else {
                creixent = true;
            }

            lastChar = currentChar;
        }

        return creixent && decreixent;
    }

    public static String textToNormal(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = charToNormal(text.charAt(i));
            if ((int)currentChar >= 97 && (int)currentChar <= 122
            || currentChar == 'ç')
                newText += charToNormal(currentChar);
        }
        return newText;
    }

    public static Character charToNormal(char character) {
        if (Character.isLetter(character)) {
            character = Character.toLowerCase(character);

            switch (character) {
                case 'à':
                case 'á':
                    return Character.isLowerCase(character) ? 'a' : 'A';
                case 'è':
                case 'é':
                case 'ë':
                    return Character.isLowerCase(character) ? 'e' : 'E';
                case 'ì':
                case 'í':
                case 'ï':
                    return Character.isLowerCase(character) ? 'i' : 'I';
                case 'ò':
                case 'ó':
                case 'ö':
                    return Character.isLowerCase(character) ? 'o' : 'O';
                case 'ù':
                case 'ú':
                case 'ü':
                    return Character.isLowerCase(character) ? 'u' : 'U';
                case 'ç':
                    return Character.isLowerCase(character) ? 'c' : 'C';
                default:
                    return Character.isLowerCase(character) ? character : Character.toUpperCase(character);
            }
        }
        return character;
    }

    private static String textToLower(String text) {
        String newText = "";

        for (int i = 0; i < text.length(); i++)
            newText += Character.toUpperCase(text.charAt(i));
        return newText;
    }
}