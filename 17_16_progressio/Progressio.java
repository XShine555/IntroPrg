public class Progressio {
    public static void main(String[] args) {
        System.out.println("Intruduïu text. Enter per finalitzar.");
        String text = Entrada.readLine();

        while (!text.isBlank()) {
            boolean anyValid = true;
            String buffer = "";

            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
    
                if (Character.isWhitespace(currentChar) || i == text.length() - 1) {
                    if (i == text.length() - 1 && Character.isLetter(currentChar))
                        buffer += currentChar;

                    if (buffer.length() < 3) {
                        buffer = "";
                        anyValid = false;
                        continue;
                    }
    
                    if (UtilString.esCreixent(buffer)) {
                        System.out.format("\"%s\" és creixent\n", buffer);
                    } else if (UtilString.esDecreixent(buffer)) {
                        System.out.format("\"%s\" és decreixent\n", buffer);
                    }
                     else if (UtilString.esCreixiDecri(buffer)) {
                        System.out.format("\"%s\" és creixidecri\n", buffer);
                    } else if (UtilString.esDecriCreixi(buffer)) {
                        System.out.format("\"%s\" és decricreixi\n", buffer);
                    } else {
                        System.out.format("\"%s\" és normaleta\n", buffer);
                    }
    
                    buffer = "";
                }
                else if (Character.isLetter(currentChar)) {
                    buffer += currentChar;
                }
            }
    
            if (!anyValid && buffer.length() != 0)
                System.out.println("Cap paraula vàlida");
    
            text = Entrada.readLine();
        }

        System.out.println("Adéu");

        //System.out.println(UtilString.esCreixent("eΠi!!!!!!j"));
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
