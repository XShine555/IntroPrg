public class UtilString {
    public static boolean esVocal(char character) {
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
               character == 'à' || character == 'á' || character == 'è' || character == 'é' || character == 'ì' ||
               character == 'í' || character == 'ò' || character == 'ó' || character == 'ù' || character == 'ú' ||
               character == 'ü' || character == 'ï';
    }    

    public static String nomesLletres(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);
            if (Character.isLetter(iChar))
                result += iChar;
        }

        return result;
    }

    public static String lletresSeparades(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);

            if (i > 0)
                result += ", " + iChar;
            else 
                result += iChar;
        }

        return result;
    }
}
