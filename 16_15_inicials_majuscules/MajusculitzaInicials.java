public class MajusculitzaInicials {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();
        
        majusculitzaInicials(userInput);
    }

    public static void majusculitzaInicials(String text) {
        int textLen = text.length();

        String newText = "";
        for (int i = 0; i < textLen; i++) {
            char iChar = text.charAt(i);

            if (i > 0) {
                char lastChar = text.charAt(i - 1);
                if (!Character.isLetter(lastChar)) {
                    iChar = Character.toUpperCase(iChar);
                } else {
                    iChar = Character.toLowerCase(iChar);
                }
            } else {
                iChar = Character.toUpperCase(iChar);
            }

            newText += iChar;
        }
        System.out.println(newText);
    }
}
