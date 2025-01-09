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
                    if (!isValid(buffer)) {
                        buffer = "";
                        continue;
                    }
                    if (esCreixent(buffer)) {
                        anyValid = true;
                        System.out.format("\"%s\" és creixent\n", buffer);
                    } else if (esDecreixent(buffer)) {
                        anyValid = true;
                        System.out.format("\"%s\" és decreixent\n", buffer);
                    } else {
                        anyValid = true;
                        System.out.format("\"%s\" és normaleta\n", buffer);
                    }
                    buffer = "";
                }
            }
            if (!buffer.isEmpty()) {
                if (!isValid(buffer)) {
                    buffer = "";
                }else{
                    if (esCreixent(buffer)) {
                        anyValid = true;
                        System.out.format("\"%s\" és creixent\n", buffer);
                    } else if (esDecreixent(buffer)) {
                        anyValid = true;
                        System.out.format("\"%s\" és decreixent\n", buffer);
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

    private static boolean isValid(String text) {
        return text.length() > 1;
    }

    private static boolean esCreixent(String text) {
        int lastIndex = (int) text.charAt(0);

        for (int i = 1; i < text.length(); i++) {
            char iChar = charToNormal(text.charAt(i));

            if (!Character.isLetter(iChar)) {
                continue;
            }

            if (lastIndex > (int) iChar) {
                return false;
            }

            lastIndex = (int) iChar;
        }

        return true;
    }

    private static boolean esDecreixent(String text) {
        int lastIndex = (int) text.charAt(0);

        for (int i = 1; i < text.length(); i++) {
            char iChar = charToNormal(text.charAt(i));

            if (!Character.isLetter(iChar)) {
                continue;
            }

            if (lastIndex < (int) iChar) {
                return false;
            }

            lastIndex = (int) iChar;
        }

        return true;
    }

    public static Character charToNormal(char character) {
        if (Character.isLetter(character)) {
            character = Character.toLowerCase(character);

            switch (character) {
                case 'à':
                case 'á':
                    return 'a';
                case 'è':
                case 'é':
                    return 'e';
                case 'ì':
                case 'í':
                case 'ï':
                    return 'i';
                case 'ò':
                case 'ó':
                case 'ö':
                    return 'o';
                case 'ù':
                case 'ú':
                case 'ü':
                    return 'u';
                case 'ñ':
                    return 'n';
                case 'ç':
                    return 'c';
                default:
                    return character;
            }
        }
        return character;
    }
}
