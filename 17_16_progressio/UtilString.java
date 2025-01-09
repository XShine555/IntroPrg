public class UtilString {
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