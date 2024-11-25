public class TriangleLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        int textLen = userInput.length();
        for (int i = 0; i <= textLen; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(userInput.charAt(j));
                if (j != i - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
