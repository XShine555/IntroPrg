/*
 * Exercici 14_17. Enters estrictes
 * Iker Rivera Garcia
 * 18/11/2024
 * Programa que indica si un texto es entero o no (ampliación).
 */

public class Enters {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine().replace(" ", "");

        while (!text.isBlank()) {
            boolean isNumber = true;
            int textLen = text.length();

            for (int i = 0; i < text.length() && isNumber; i++) {
                char iChar = text.charAt(i);
                boolean isSymbol = iChar == '+' || iChar == '-' || iChar == '*' || iChar == '/' || iChar == '%'
                        || iChar == '.' || iChar == '_';

                // Sí hay un símbolo al al final.
                if (i == textLen - 1 && isSymbol) {
                    isNumber = false;
                }
                // Si es un símbolo comprobar que no tenga duplicados y sea válido.
                else if (isSymbol && i > 1) {

                    if (i > 1) {
                        char priorChar = text.charAt(i - 1);
                        char nextChar = text.charAt(i + 1);
                        
                        boolean isPriorSymbol = priorChar == '+' || priorChar == '-' || priorChar == '*' || priorChar == '/' || priorChar == '%'
                        || priorChar == '.' || priorChar == '_';
                        boolean isNextSymbol = nextChar == '+' || nextChar == '-' || nextChar == '*' || nextChar == '/' || nextChar == '%'
                        || nextChar == '.' || nextChar == '_';
                        
                        if (isNextSymbol && isPriorSymbol) {
                            isNumber = false;
                        }
                    }
                }

                /*if (isSymbol && i == text.length() - 1) {
                    isNumber = false;
                } else if (!Character.isDigit(iChar) && !isSymbol) {
                    if (i > 0 && i != text.length() - 1 && (iChar == '.' || iChar == '_')) {
                        char lastChar = text.charAt(i - 1);
                        char nextChar = text.charAt(i + 1);

                        if (!Character.isDigit(lastChar) || !Character.isDigit(nextChar)) {
                            isNumber = false;
                        }
                    } else {
                        isNumber = false;
                    }
                } else if (i > 0) {
                    char lastChar = text.charAt(i - 1);
                    boolean isLastCharSymbol = lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/'
                            || lastChar == '%';

                    if (isLastCharSymbol && isSymbol) {
                        isNumber = false;
                    }
                }*/
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