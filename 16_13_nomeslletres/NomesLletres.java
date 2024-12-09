public class NomesLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        filtraLletres(text);
    }    

    public static void filtraLletres(String text) {
        String finalText = "";

        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);

            if (Character.isLetter(iChar)) {
                if (finalText.length() > 0) {
                    finalText += ", " + iChar;
                }
                else {
                    finalText += iChar;
                }
            }
        }

        System.out.println(finalText);
    }
}
