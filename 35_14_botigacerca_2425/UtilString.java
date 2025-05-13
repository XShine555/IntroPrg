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

    public static boolean esPlantillaDeText(String text, String plantilla) {
        if (plantilla == null || text == null) {
            return false;
        }
        if (plantilla.length() > text.length()) {
            return false;
        }

        text = normalitzaString(text).toLowerCase();
        plantilla = normalitzaString(plantilla).toLowerCase();

        return text.startsWith(plantilla) || plantilla.startsWith(text);
    }

    public static boolean isSpecialChar(char character) {
        for (char specialChar : SPECIAL_CHARS) {
            if (character == specialChar) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        var n1 = "no";
        var n2 = "nom";

        System.out.println(
            n1.startsWith(n2) || n2.startsWith(n1)
        );
    }
}
