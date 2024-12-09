public class VocalsMajuscules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        majusculitzaVocals(userInput);
    }

    public static void majusculitzaVocals(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);
            char iUpperChar = Character.toUpperCase(iChar);
            boolean isMayus = iUpperChar == 'A' || iUpperChar == 'E' || iUpperChar == 'I' || iUpperChar == 'O'
                    || iUpperChar == 'U';

            newText += isMayus ? iUpperChar : Character.toLowerCase(iChar);
        }

        System.out.println(newText);
    }
}
