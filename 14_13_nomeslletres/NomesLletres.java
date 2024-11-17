public class NomesLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        String sanitizeText = "";

        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);

            if (Character.isLetter(iChar)){
                sanitizeText += iChar;
            }
        }

        for (int i = 0; i < sanitizeText.length(); i++) {
            char iChar = sanitizeText.charAt(i);

            if (i < 1) {
                System.out.print(iChar);
            }
            else {
                System.out.print(", " + iChar);
            }
        }
    }    
}
