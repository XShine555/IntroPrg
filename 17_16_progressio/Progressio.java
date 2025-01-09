public class Progressio {
    public static void main(String[] args) {
        System.out.println("Intruduïu text. Enter per finalitzar.");
        String text = Entrada.readLine();

        while (!text.isBlank()) {
            String buffer = "";
            boolean anyValid = false;

            for (int i = 0; i < text.length(); i++) {
                char iChar = text.charAt(i);

                if (Character.isLetterOrDigit(iChar)) {
                    buffer += iChar;
                } else if (Character.isWhitespace(iChar)) {
                    if (buffer.length() <= 1) {
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
                     else if (UtilString.esCreixiDecri(buffer, false)) {
                        anyValid = true;
                        System.out.format("\"%s\" és creixidecri\n", buffer);
                    } else if (UtilString.esDecriCreixi(buffer, false)) {
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
                if (buffer.length() <= 1) {
                    buffer = "";
                }else{
                    if (UtilString.esCreixent(buffer, false)) {
                        anyValid = true;
                        System.out.format("\"%s\" és creixent\n", buffer);
                    } else if (UtilString.esDecreixent(buffer, false)) {
                        anyValid = true;
                        System.out.format("\"%s\" és decreixent\n", buffer);
                    }
                     else if (UtilString.esCreixiDecri(buffer, false)) {
                        anyValid = true;
                        System.out.format("\"%s\" és creixidecri\n", buffer);
                    } else if (UtilString.esDecriCreixi(buffer, false)) {
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

        System.out.println("Adéu");
    }
}
