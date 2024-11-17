public class NomesLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);

            if (Character.isLetter(iChar)) {
                if (i < 1) {
                    System.out.print(iChar);
                }
                else {
                    System.out.print(", " + iChar);
                }
            }
        }
    }    
}
