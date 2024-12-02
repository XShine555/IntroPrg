/*
 * Exercici 15_16. Maleïda contrasenya
 * Iker Rivera Garcia
 * 2/12/2024
 * Programa que comprueba que una contraseña sea segura.
 */

public class Password {
    public static void main(String[] args) {
        String userInput = Entrada.readLine();

        if (userInput.length() < 8 || userInput.length() > 16) {
            System.out.println("El password ha de tenir entre 8 i 16 caràcters.");
            return;
        }

        boolean hasNumber = false, hasSymbol = false;
        int mayusCount = 0, minusCount = 0;
        boolean repChar = false;
        boolean sameType = false;
        boolean hasWhitespace = false;
        boolean intPatron = false;

        String previousChars = "";

        for (int i = 0; i < userInput.length(); i++) {

            char iChar = userInput.charAt(i);

            if (Character.isUpperCase(iChar))
                mayusCount++;
            else if (Character.isLowerCase(iChar))
                minusCount++;
            else if (!Character.isLetterOrDigit(iChar)) {
                hasSymbol = true;

                if (Character.isWhitespace(iChar))
                    hasWhitespace = true;
            }

            if (Character.isDigit(iChar))
                hasNumber = true;

            if (i + 1 >= 5) {
                String lastType;

                if (Character.isDigit(iChar))
                    lastType = "int";
                else if (Character.isLetter(iChar))
                    lastType = Character.isUpperCase(iChar) ? "string_mayus" : "string_minus";
                else
                    lastType = "symbol";

                int repCount = 0;
                String tempChars = "";

                for (int j = i + 1 - 5; j <= i; j++) {
                    char jChar = userInput.charAt(j);
                    String thisType;

                    if (Character.isDigit(jChar))
                        thisType = "int";
                    else if (Character.isLetter(jChar))
                        thisType = Character.isUpperCase(jChar) ? "string_mayus" : "string_minus";
                    else
                        thisType = "symbol";

                    // String.equals
                    boolean equals = lastType.length() == thisType.length();
                    if (equals) {
                        for (int c = 0; c < lastType.length()-1; c++) {
                            char cChar = lastType.charAt(c);
                            char thisTypeChar = thisType.charAt(i);
    
                            if (cChar != thisTypeChar) {
                                equals = false;
                                break;
                            }
                        }
                    }

                    if (equals) {
                        repCount++;
                        tempChars += jChar;
                    }
                }

                // String.equals
                boolean equals = lastType.length() == "int".length();
                if (equals) {
                    for (int c = 0; c < lastType.length(); c++) {
                        char cChar = lastType.charAt(c);
                        char thisTypeChar = "int".charAt(i);
    
                        if (cChar != thisTypeChar) {
                            equals = false;
                            break;
                        }
                    }
                }

                if (repCount >= 3 && equals) {
                    int rep = 0;

                    int firstNum = Integer.parseInt(tempChars.charAt(0) + "");
                    for (int j = 1; j < tempChars.length(); j++) {
                        int num = Integer.parseInt(tempChars.charAt(j) + "");
                        if (firstNum + 1 == num || firstNum - 1 == num) {
                            rep++;
                        }
                        firstNum = num;
                    }
                    if (rep >= 3) {
                        intPatron = true;
                    }
                }

                if (repCount > 4) {
                    sameType = true;
                }
            }

            // String.contains
            for (int j = 0; j < previousChars.length(); j++) {
                char jChar = previousChars.charAt(j);
                if (jChar == iChar)
                    repChar = true;
            }

            previousChars += iChar;
        }

        if (!hasNumber)
            System.out.println("El password ha de contenir com a mínim un numero.");
        else if (mayusCount < 1)
            System.out.println("El password ha de contenir com a mínim una lletra majúscula.");
        else if (minusCount < 1)
            System.out.println("El password ha de contenir com a mínim una lletra minúscula.");
        else if (!hasSymbol)
            System.out.println("El password ha de contenir com a mínim un símbol.");
        else if (mayusCount < minusCount)
            System.out.println("El password no pot contenir menys majúscules que minúscules.");
        else if (repChar)
            System.out.println("El password no pot contenir caràcters repetits.");
        else if (hasWhitespace)
            System.out.println("El password no pot contenir espais en blanc.");
        else if (sameType)
            System.out.println("El password no pot contenir més de 4 caràcters seguits del mateix tipus.");
        else if (intPatron)
            System.out.println("El password no pot contenir més de 3 números consecutius.");
        else
            System.out.println("El maleït password és vàlid!");
    }
}
