public class UtilString {
    public static boolean esVocal(char character) {
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
               character == 'à' || character == 'á' || character == 'è' || character == 'é' || character == 'ì' ||
               character == 'í' || character == 'ò' || character == 'ó' || character == 'ù' || character == 'ú' ||
               character == 'ü' || character == 'ï';
    }    
}
