/*
 * Exercici 16_10. Un triangle de lletres
 * Iker Rivera Garcia
 * 09/12/2024
 * Dibuja un triángulo con las letras de la frase.
 */

public class TriangleLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        dibuixaTriangle(userInput);
    }

    public static void dibuixaTriangle(String text) {
        int textLen = text.length();
        for (int i = 0; i <= textLen; i++) {
            dibuixaLinia(text, i);
            System.out.println();
        }
    }

    public static void dibuixaLinia(String text, int linia) {
        for (int j = 0; j < linia; j++) {
            System.out.print(text.charAt(j));
            if (j != linia - 1) {
                System.out.print(", ");
            }
        }
    }
}
