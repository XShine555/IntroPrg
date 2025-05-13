public class UtilString {
    private static final char[] SPECIAL_CHARS = { '\'' };

    public static String normalitzaString(String nom) {
        if (nom == null || nom.isBlank()) {
            return null;
        }

        String result = "";

        for (int i = 0; i < nom.length(); i++) {
            char thisChar = nom.charAt(i);

            if (i > 0) {
                char lastChar = nom.charAt(i - 1);

                if (Character.isLetterOrDigit(thisChar)
                        || (Character.isWhitespace(thisChar) && !Character.isWhitespace(lastChar))
                        || isSpecialChar(thisChar)) {
                    result += thisChar;
                }
            } else {
                if (Character.isLetterOrDigit(thisChar)) {
                    result += thisChar;
                }
            }
        }

        return result.trim();
    }

    public static boolean esPlantillaDeText(String plantilla, String text) {
        if (plantilla == null || text == null) {
            return false;
        }
        if (text.length() > plantilla.length())
        {
            return false;
        }

        plantilla = normalitzaString(plantilla).toLowerCase();
        text = normalitzaString(text).toLowerCase();
        return plantilla.startsWith(text);
    }

    public static boolean isSpecialChar(char character) {
        for (char specialChar : SPECIAL_CHARS) {
            if (character == specialChar) {
                return true;
            }
        }

        return false;
    }
}
