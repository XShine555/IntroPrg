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

        String previousChars = "";

        for (int i = 0; i < userInput.length(); i++) {
            boolean isValid = true;

            char iChar = userInput.charAt(i);

            if (Character.isDigit(iChar)) {
                hasNumber = true;

                if (i > 4) {
                    String lastType;

                    if (Character.isDigit(iChar))
                        lastType = "int";
                    else if (Character.isLetter(iChar))
                        lastType = "string";
                    else
                        lastType = "symbol";

                    for (int j = i; j > userInput.length() - 4; i--) {
                        char jChar = userInput.charAt(j);
                        String thisType;

                        if (Character.isDigit(jChar))
                            thisType = "int";
                        else if (Character.isLetter(jChar))
                            thisType = "string";
                        else
                            thisType = "symbol";

                        if (thisType == lastType) {
                            isValid = false;
                            sameType = true;
                            break;
                        }
                    }
                }
            }
            else if (Character.isUpperCase(iChar))
                mayusCount++;
            else if (Character.isLowerCase(iChar))
                minusCount++;
            else if (Character.isWhitespace(iChar)) {
                isValid = false;
                hasWhitespace = true;
            }
            else if (!Character.isLetterOrDigit(iChar))
                hasSymbol = true;
        
            // String.Contains
            for (int j = 0; j < previousChars.length(); j++) {
                char jChar = userInput.charAt(j);
                if (jChar == iChar)
                    isValid = false;
                    repChar = true;
                    break;
            }

            previousChars += iChar;

            if (!isValid)
                break;
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
            System.out.println("char rep");
        else if (sameType)
            System.out.println("4 same type");
        else
            System.out.println("Todo bien");

        /*boolean isValid = userInput.length() >= 8 && userInput.length() < 16;

        if (isValid) {
            boolean hasNumber = false, hasSymbol = false;
            int mayusCount = 0, minusCount = 0;

            String previousChars = "";

            for (int i = 0; i < userInput.length(); i++) {
                char iChar = userInput.charAt(i);

                if (Character.isDigit(iChar)) {
                    hasNumber = true;

                    if (i > 4) {
                        String lastType;

                        if (Character.isDigit(iChar))
                            lastType = "int";
                        else if (Character.isLetter(iChar))
                            lastType = "string";
                        else
                            lastType = "symbol";

                        for (int j = i; j > userInput.length() - 4; i--) {
                            char jChar = userInput.charAt(j);
                            String thisType;

                            if (Character.isDigit(jChar))
                                thisType = "int";
                            else if (Character.isLetter(jChar))
                                thisType = "string";
                            else
                                thisType = "symbol";

                            if (thisType == lastType) {
                                isValid = false;
                                break;
                            }
                        }
                    }
                }
                else if (Character.isUpperCase(iChar))
                    mayusCount++;
                else if (Character.isLowerCase(iChar))
                    minusCount++;
                else if (Character.isWhitespace(iChar))
                    isValid = false;
                else if (!Character.isLetterOrDigit(iChar))
                    hasSymbol = true;
            
                // String.Contains
                for (int j = 0; j < previousChars.length(); j++) {
                    char jChar = userInput.charAt(j);
                    if (jChar == iChar)
                        isValid = false;
                }

                previousChars += iChar;

                if (!isValid)
                    break;
            }

            if (!hasNumber || !hasSymbol || mayusCount < 1 || minusCount < 1 || mayusCount < minusCount)
                isValid = false;
        }*/

        //System.out.println(isValid);
    }    
}
