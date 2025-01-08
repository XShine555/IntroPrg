public class UtilString {
    public static boolean esEnter(String text) {
        if (text.isBlank() || text.isEmpty())
            return false;

        int textLen = text.length();
        for (int i = 0; i < textLen; i++) {
            char iChar = text.charAt(i);
            if (Character.isWhitespace(iChar)) {
                return false;
            }

            boolean isSymbolOrInvalid = (iChar == '+' || iChar == '-' || iChar == '*' || iChar == '/'
                || iChar == '%'
                || iChar == '.' || iChar == '_') || Character.isLetter(iChar);
            // Sí hay un símbolo al al final.
            if (i == textLen - 1 && isSymbolOrInvalid) {
                return false;
            }
            // Si es un símbolo comprobar que no tenga duplicados y sea válido.
            else if (i > 0) {
                char priorChar = text.charAt(i - 1);
                boolean isPriorSymbol = (priorChar == '+' || priorChar == '-' || priorChar == '*'
                        || priorChar == '/' || priorChar == '%'
                        || priorChar == '.' || priorChar == '_') || Character.isLetter(iChar);
                if (isSymbolOrInvalid && isPriorSymbol) {
                    return false;
                }
            }
            // En caso de que empiece por "." O "-" es inválido.
            else if (iChar == '.' || iChar == '_' || Character.isLetter(iChar)) {
                return false;
            }
        }
        
        return true;
    }

    public static boolean esEnter(String text, boolean estricte) {
        if (text.isBlank() || text.isEmpty())
            return false;

        String sanitizeString = text;
        if (!estricte) {
            // Replace
            for (int i = 0; i < text.length(); i++) {
                char iChar = text.charAt(i);
                if (!Character.isWhitespace(iChar)) {
                    sanitizeString += iChar;
                }
            }
        }

        int textLen = sanitizeString.length();
        for (int i = 0; i < textLen; i++) {
            char iChar = sanitizeString.charAt(i);
            boolean isSymbolOrInvalid = (iChar == '+' || iChar == '-' || iChar == '*' || iChar == '/'
                || iChar == '%'
                || iChar == '.' || iChar == '_') || Character.isLetter(iChar);
            // Sí hay un símbolo al al final.
            if (i == textLen - 1 && isSymbolOrInvalid) {
                return false;
            }
            // Si es un símbolo comprobar que no tenga duplicados y sea válido.
            else if (i > 0) {
                char priorChar = sanitizeString.charAt(i - 1);
                boolean isPriorSymbol = (priorChar == '+' || priorChar == '-' || priorChar == '*'
                        || priorChar == '/' || priorChar == '%'
                        || priorChar == '.' || priorChar == '_') || Character.isLetter(iChar);
                if (isSymbolOrInvalid && isPriorSymbol) {
                    return false;
                }
            }
            // En caso de que empiece por "." O "-" es inválido.
            else if (iChar == '.' || iChar == '_' || Character.isLetter(iChar)) {
                return false;
            }
        }
        
        return true;
    }

    public static int aEnter(String text, boolean estricte) {
        String sanitizeString = text;
        if (!estricte) {
            // Replace
            for (int i = 0; i < text.length(); i++) {
                char iChar = text.charAt(i);
                if (!Character.isWhitespace(iChar)) {
                    sanitizeString += iChar;
                }
            }
        }

        return Integer.parseInt(sanitizeString);
    }
}