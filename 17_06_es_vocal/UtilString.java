/*
 * Exercici 17_06. És vocal
 * Iker Rivera Garcia
 * Clase que proporciona métodos para comprobar si un carácter es vocal.
 */
public class UtilString {
    public static boolean esVocal(char character) {
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
               character == 'à' || character == 'á' || character == 'è' || character == 'é' || character == 'ì' ||
               character == 'í' || character == 'ò' || character == 'ó' || character == 'ù' || character == 'ú' ||
               character == 'ü' || character == 'ï';
    }    
}
