public class Progressio {
    public static void main(String[] args) {
        System.out.println("Intruduïu text. Enter per finalitzar.");
        System.out.println(UtilString.esDecreixent("una", false));
        /*String text = Entrada.readLine();

        while (!text.isBlank()) {
            String buffer = "";
            boolean anyValid = false;

            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
    
                if (Character.isWhitespace(currentChar) || i == text.length() - 1) {
                    if (i == text.length() - 1 && !Character.isWhitespace(currentChar))
                        buffer += currentChar;

                    String normalizeText = UtilString.textToNormal(buffer);

                    if (normalizeText.length() < 3) {
                        buffer = "";
                        continue;
                    }
    
                    if (UtilString.esCreixent(buffer, false)) {
                        System.out.format("\"%s\" és creixent\n", buffer);
                    } else if (UtilString.esDecreixent(buffer, false)) {
                        System.out.format("\"%s\" és decreixent\n", buffer);
                    }
                     else if (UtilString.esCreixiDecri(buffer)) {
                        System.out.format("\"%s\" és creixidecri\n", buffer);
                    } else if (UtilString.esDecriCreixi(buffer)) {
                        System.out.format("\"%s\" és decricreixi\n", buffer);
                    } else {
                        System.out.format("\"%s\" és normaleta\n", buffer);
                    }
                    anyValid = true;
    
                    buffer = "";
                }
                else {
                    buffer += currentChar;
                }
            }

            if (!anyValid)
                System.out.println("Cap paraula vàlida");
    
            text = Entrada.readLine();
        }

        System.out.println("Adéu");*/
        /*String text = Entrada.readLine();

        while (!text.isBlank()) {
            String buffer = "";
            boolean anyValid = false;

            for (int i = 0; i < text.length(); i++) {
                char iChar = text.charAt(i);

                if (!Character.isWhitespace(iChar)) {
                    buffer += iChar;
                } else {
                    if (UtilString.textToNormal(buffer).length() < 3) {
                        buffer = "";
                        continue;
                    }
                    if (UtilString.esCreixent(buffer, false)) {
                        anyValid = true;
                        System.out.format("\"%s\" és creixent\n", buffer);
                    } else if (UtilString.esDecreixent(buffer, false)) {
                        anyValid = true;
                        System.out.format("\"%s\" és decreixent\n", buffer);
                    }
                     else if (UtilString.esCreixiDecri(buffer)) {
                        anyValid = true;
                        System.out.format("\"%s\" és creixidecri\n", buffer);
                    } else if (UtilString.esDecriCreixi(buffer)) {
                        anyValid = true;
                        System.out.format("\"%s\" és decricreixi\n", buffer);
                    } else {
                        anyValid = true;
                        System.out.format("\"%s\" és normaleta\n", buffer);
                    }
                    buffer = "";
                }
            }
            if (!buffer.isEmpty()) {
                if (UtilString.textToNormal(buffer).length() < 3) {
                    buffer = "";
                }else{
                    if (UtilString.esCreixent(buffer, false)) {
                        anyValid = true;
                        System.out.format("\"%s\" és creixent\n", buffer);
                    } else if (UtilString.esDecreixent(buffer, false)) {
                        anyValid = true;
                        System.out.format("\"%s\" és decreixent\n", buffer);
                    }
                     else if (UtilString.esCreixiDecri(buffer)) {
                        anyValid = true;
                        System.out.format("\"%s\" és creixidecri\n", buffer);
                    } else if (UtilString.esDecriCreixi(buffer)) {
                        anyValid = true;
                        System.out.format("\"%s\" és decricreixi\n", buffer);
                    } else {
                        anyValid = true;
                        System.out.format("\"%s\" és normaleta\n", buffer);
                    }
                }
            }
            if (!anyValid)
                System.out.println("Cap paraula vàlida");

            text = Entrada.readLine();
        }

        System.out.println("Adéu");*/
    }
}
