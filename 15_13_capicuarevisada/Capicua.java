public class Capicua {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();
        int inputLen = userInput.length();

        String sanitizeText = "";
        for (int i = 0; i < inputLen; i++) {
            char iChar = userInput.charAt(i);

            if (Character.isWhitespace(iChar) || iChar == ',' || iChar == '.')
                continue;

            char newChar = switch (iChar) {
                case 'à' -> 'a';
                case 'é' -> 'e';
                case 'è' -> 'e';
                case 'í' -> 'i';
                case 'ï' -> 'i';
                case 'ó' -> 'o';
                case 'ò' -> 'o';
                case 'ú' -> 'u';
                case 'ù' -> 'u';
                case 'ç' -> 'c';
                default -> Character.toLowerCase(iChar);
            };


            if (iChar != '\'') {
                sanitizeText += newChar;
            }
        }

        boolean isValid = !userInput.isBlank();
        boolean anyLetter = false;
        if (isValid) {
            for (int i = 0; i < sanitizeText.length(); i++) {
                char firstChar = sanitizeText.charAt(i);
                char lastChar = sanitizeText.charAt(sanitizeText.length() - i - 1);

                if (!Character.isLetter(firstChar) || !Character.isLetter(lastChar))
                    continue;
                else
                    anyLetter = true;
    
                if (firstChar != lastChar){
                    isValid = false;
                    break;
                }
            }
        }

        System.out.format("\"%s\" %s", userInput, isValid && anyLetter ? "és capicua" : "no és capicua");
    }    
}
