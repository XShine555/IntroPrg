/*
 * Exercici 14_17. Enters estrictes
 * Iker Rivera Garcia
 * 18/11/2024
 * Programa que indica si un texto es entero o no (ampliación).
 */

public class Enters {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();

        while (!text.isBlank()) {
            boolean isNumber = true;
            text = text.replace(" ", "");
            int textLen = text.length();

            for (int i = 0; i < text.length() && isNumber; i++) {
                char iChar = text.charAt(i);
                boolean isSymbolOrInvalid = (iChar == '+' || iChar == '-' || iChar == '*' || iChar == '/'
                        || iChar == '%'
                        || iChar == '.' || iChar == '_') || Character.isLetter(iChar);

                // Sí hay un símbolo al al final.
                if (i == textLen - 1 && isSymbolOrInvalid) {
                    isNumber = false;
                }
                // Si es un símbolo comprobar que no tenga duplicados y sea válido.
                else if (i > 0) {
                    char priorChar = text.charAt(i - 1);

                    boolean isPriorSymbol = (priorChar == '+' || priorChar == '-' || priorChar == '*'
                            || priorChar == '/' || priorChar == '%'
                            || priorChar == '.' || priorChar == '_') || Character.isLetter(iChar);

                    if (isSymbolOrInvalid && isPriorSymbol) {
                        isNumber = false;
                    }
                }
                // En caso de que empiece por "." O "-" es inválido.
                else if (iChar == '.' || iChar == '_' || Character.isLetter(iChar)) {
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