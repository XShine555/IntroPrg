import java.util.StringJoiner;

public class NomesLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        StringJoiner finalText = new StringJoiner(", ");

        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);

            if (Character.isLetter(iChar)) {
                finalText.add(String.valueOf(iChar));
            }
        }

        System.out.println(finalText);
    }    
}
