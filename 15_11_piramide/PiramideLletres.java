/*
 * Exercici 15_11. Una piràmide amb el nom
 * Iker Rivera Garcia
 * 2/11/2024
 * Genera un triángulo con las letras del texto.
 */

public class PiramideLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        int userInputLength = userInput.length();

        for (int col = 0; col < userInputLength; col++) {
            int dots = userInputLength - col - 1;

            // Left dots
            for (int j = 0; j < dots * 2; j++) {
                System.out.print(".");
            }

            for (int row = 0; row < col + 1; row++) {
                System.out.print(userInput.charAt(row));
                if (row != col)
                    System.out.print(".");
            }
            System.out.print("-");
            for (int row = col; row > -1; row--) {
                System.out.print(userInput.charAt(row));
                if (row != 0)
                    System.out.print(".");
            }

            // Right dots
            for (int j = 0; j < dots * 2; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
