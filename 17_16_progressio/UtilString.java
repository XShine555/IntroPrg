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

    public static boolean esCreixiDecri(String argText, boolean estricta) {
        String text = "";

        for (int i = 0; i < argText.length(); i++) {
            text += charToNormal(argText.charAt(i));
        }
        if (text.length() < 3) return false;

        boolean creixent = true;
        boolean decreixent = false;
        boolean haDecreixut = false;

        for (int i = 1; i < text.length(); i++) {
            char anterior = text.charAt(i - 1);
            char actual = text.charAt(i);

            if (creixent) {
                if (actual < anterior) {
                    creixent = false;
                    decreixent = true;
                    haDecreixut = true;
                } else if (estricta && actual == anterior) {
                    return false;
                }
            } else if (decreixent) {
                if (actual > anterior) {
                    return false;
                } else if (estricta && actual == anterior) {
                    return false;
                }
            }
        }

        return haDecreixut && decreixent;
    }

    public static boolean esCreixiDecri(String text) {
        return esCreixiDecri(text, true);
    }

    public static boolean esDecriCreixi(String test) {
        int lastIndex = (int) test.charAt(0);

        for (int i = 1; i < test.length(); i++) {
            char iChar = test.charAt(i);

            if (!Character.isLetter(iChar)) {
                continue;
            }

            if (lastIndex <= (int) iChar) {
                return false;
            }

            lastIndex = (int) iChar;
        }

        return true;
    }

    public static boolean esDecriCreixi(String test, boolean estricta) {
        String sanitizedText = test;

        if (!estricta) {
            sanitizedText = "";
            for (int i = 0; i < test.length(); i++) {
                sanitizedText += charToNormal(test.charAt(i));
            }
        }

        return esDecriCreixi(sanitizedText);
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