/*
 * Exercici 15_10. Un triangle de lletres invertit
 * Iker Rivera Garcia
 * 2/12/2024
 * Dibuja un triángulo invertido con las letras de la frase.
 */

public class TriangleLletresInvertit {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        int textLen = userInput.length();
        for (int i = textLen - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(userInput.charAt(j));
                if (j != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }    
}
