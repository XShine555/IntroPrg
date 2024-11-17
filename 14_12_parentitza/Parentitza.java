public class Parentitza {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);

            if (Character.isLetterOrDigit(iChar)) {
                System.out.format("(%s)", iChar);
            } else {
                System.out.print(iChar);
            }
        }
    }
}
