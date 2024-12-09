public class TriangleLletresInvertit {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        dibuixaTriangleInvertit(userInput);
    }

    public static void dibuixaTriangleInvertit(String text) {
        int textLen = text.length();

        for (int i = textLen - 1; i >= 0; i--) {
            dibuixaLiniaInvertida(text, i);
            System.out.println();
        }
    }

    public static void dibuixaLiniaInvertida(String text, int linia) {
        for (int j = linia; j >= 0; j--) {
            System.out.print(text.charAt(j));
            if (j != 0) {
                System.out.print(", ");
            }
        }
    }
}
