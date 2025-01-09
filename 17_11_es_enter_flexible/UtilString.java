public class UtilString {
    public static boolean esEnter(String text) {
        if (text.isBlank() || text.isEmpty())
            return false;

        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);
            if (Character.isWhitespace(iChar))
                return false;

            boolean isSymbol = iChar == '+' || iChar == '-' || iChar == '*' || iChar == '/' || iChar == '%';

            if (isSymbol && i == text.length() - 1) {
                return false;
            } else if (!Character.isDigit(iChar) && !isSymbol) {
                return false;
            } else if (i > 0) {
                char lastChar = text.charAt(i - 1);
                boolean isLastCharSymbol = lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/'
                        || lastChar == '%';

                if (isLastCharSymbol && isSymbol) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean esEnter(String text, boolean estricte) {
        if (text.isBlank() || text.isEmpty())
            return false;

        if (!estricte) 
            text = text.replace(" ", "").replace(".", "").replace("_", "");
        
        return esEnter(text);
    }

    public static int aEnter(String text, boolean estricte) {
        if (!estricte)
            text = text.replace(" ", "");

        if (esEnter(text) && !estricte) {
            return Integer.parseInt(text.replace(".", "").replace("_", ""));
        }
        return Integer.parseInt(text);
    }
}