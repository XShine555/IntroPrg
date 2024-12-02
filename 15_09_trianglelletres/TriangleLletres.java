/*
 * Exercici 15_09. Un triangle de lletres
 * Iker Rivera Garcia
 * 2/12/2024
 * Dibuja un triángulo con las letras de la frase.
 */

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
