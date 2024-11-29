public class Password {
    public static void main(String[] args) {
        System.out.println("Text?");
        String userInput = Entrada.readLine();

        boolean isValid = userInput.length() >= 8 && userInput.length() < 16;

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
        }

        System.out.println(isValid);
    }    
}
