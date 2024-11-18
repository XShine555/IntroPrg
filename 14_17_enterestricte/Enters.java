/*
 * Exercici 14_17. Enters estrictes
 * Iker Rivera Garcia
 * 18/11/2024
 * Programa que indica si un texto es entero o no.
 */

public class Enters {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();

        while (!text.isBlank()) {
            boolean isNumber = true;

            for (int i = 0; i < text.length() && isNumber; i++) {
                char iChar = text.charAt(i);
                if (!Character.isDigit(iChar)) {
                    isNumber = false;
                }
            }

            if (isNumber) {
                System.out.println("És enter");
            } else {
                System.out.println("No és enter");
            }

            text = Entrada.readLine();
        }

        System.out.println("Adéu");
    }
}