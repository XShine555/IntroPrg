public class MajusculitzaInicials {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();
        int textLen = userInput.length();

        String newText = "";
        for (int i = 0; i < textLen; i++) {
            char iChar = userInput.charAt(i);

            if (i > 0) {
                char lastChar = userInput.charAt(i - 1);
                if (Character.isWhitespace(lastChar)) {
                    iChar = Character.toUpperCase(iChar);
                }
                else {
                    iChar = Character.toLowerCase(iChar);
                }
            }
            else {
                iChar = Character.toUpperCase(iChar);
            }

            newText += iChar;
        }
        System.out.println(newText);
    }    
}
