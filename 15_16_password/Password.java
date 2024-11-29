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
            boolean isValid = true;

            char iChar = userInput.charAt(i);

            if (Character.isUpperCase(iChar))
                mayusCount++;
            if (Character.isLowerCase(iChar))
                minusCount++;
            if (!Character.isLetterOrDigit(iChar)) {
                hasSymbol = true;

                if (Character.isWhitespace(iChar))
                    hasWhitespace = true;
            }

            if (Character.isLetterOrDigit(iChar)) {
                if (Character.isDigit(iChar))
                    hasNumber = true;

                //System.out.println(iChar);
                //System.out.println(i);
                if (i + 1 >= 4) {
                    String lastType;

                    if (Character.isDigit(iChar))
                        lastType = "int";
                    else if (Character.isLetter(iChar))
                        lastType = "string";
                    else
                        lastType = "symbol";

                    int repCount = 0;
                    String tempChars = "";
                    //System.out.println("i: " + String.valueOf(i-4) + "/" + i);
                    for (int j = i + 1 - 4; j <= i; j++) {
                        char jChar = userInput.charAt(j);
                        String thisType;

                        if (Character.isDigit(jChar))
                            thisType = "int";
                        else if (Character.isLetter(jChar))
                            thisType = "string";
                        else
                            thisType = "symbol";

                        if (thisType.equals(lastType)) {
                            repCount++;
                            tempChars += jChar;
                        }
                    }

                    if (repCount >= 4)
                        sameType = true;

                    if (repCount >= 3) {
                        isValid = false;
                        int rep = 0;

                        if (lastType.equals("int")) {
                            int firstNum = Integer.parseInt(tempChars.charAt(0) + "");
                            for (int j = 1; j < tempChars.length(); j++) {
                                int num = Integer.parseInt(tempChars.charAt(j) + "");
                                if (firstNum + 1 == num ||firstNum  - 1 == num) {
                                    rep++;
                                }
                                firstNum = num;
                            }
                        }

                        if (rep >= 3)
                            intPatron = true;
                    }
                }
            }
        
            // String.Contains
            /*for (int j = 0; j < previousChars.length(); j++) {
                char jChar = userInput.charAt(j);
                if (jChar == iChar)
                    isValid = false;
                    repChar = true;
                    break;
            }*/
            repChar = previousChars.contains("" + iChar);

            previousChars += iChar;

            //if (!isValid)
                //break;
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
        else if (intPatron)
            System.out.println("El password no pot contenir més de 3 números consecutius.");
        else if (sameType)
            System.out.println("El password no pot contenir més de 4 caràcters seguits del mateix tipus.");
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
