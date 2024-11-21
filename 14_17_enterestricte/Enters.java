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

            for (int i = 0; i < text.length(); i++) {
                char iChar = text.charAt(i);
                boolean isSymbol = iChar == '+' || iChar == '-' || iChar == '*' || iChar == '/' || iChar == '%';

                if (isSymbol && i == text.length() - 1) {
                    isNumber = false;
                } else if (!Character.isDigit(iChar) && !isSymbol) {
                    isNumber = false;
                } else if (i > 0) {
                    char lastChar = text.charAt(i - 1);
                    boolean isLastCharSymbol = lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/'
                            || lastChar == '%';

                    if (isLastCharSymbol && isSymbol) {
                        isNumber = false;
                    }
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