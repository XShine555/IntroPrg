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
        if (estricte)
            return esEnter(text);

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