public class TriangleParaules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        int inputLen = userInput.length();

        String totalText = "";

        for (int i = 0; i < inputLen; i++) {
            char iChar = userInput.charAt(i);

            totalText += iChar;

            if (Character.isWhitespace(iChar) || i == inputLen - 1) {
                System.out.println(totalText);
            }
        }
    }
}
