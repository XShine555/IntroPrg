/*
 * Clase UtilString.java
 * Classe UtilString, utilitats per a la manipulació de strings.
 * 13_05_2025
 * Iker Rivera Garcia
 */

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
        if (plantilla == null || plantilla.isBlank()) {
            return false;
        }
        if (text == null || text.isBlank()) {
            return true;
        }

        text = normalitzaString(text).toLowerCase();
        plantilla = normalitzaString(plantilla).toLowerCase();

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

    public static void main(String[] args) {
        var n1 = "mat".toLowerCase();
        var n2 = "Matís Negre".toLowerCase();
        System.out.println(n1);
        System.out.println(n2);

        System.out.println(
            n2.startsWith(n1)
        );
    }
}
