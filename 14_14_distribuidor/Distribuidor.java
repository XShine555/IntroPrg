public class Distribuidor {
    public static void main(String[] args) {
        System.out.println("Introduïu texts (INTRO Per finalitzar)");
        String text = Entrada.readLine();

        String vowels = "", consonants = "", names = "", symbols = "";

        while (!text.isBlank()) {
            String upperText = text.toUpperCase();

            for (int i = 0; i < upperText.length(); i++) {
                char iChar = upperText.charAt(i);

                if (Character.isDigit(iChar)) {
                    if (!names.contains(String.valueOf(iChar))) {
                        names += iChar;
                    }
                } else if (Character.isLetter(iChar)) {
                    if (iChar == 'À' || iChar == 'A' || iChar == 'È' || iChar == 'E' || iChar == 'É' || iChar == 'I'
                            || iChar == 'Ï' || iChar == 'Ò' || iChar == 'O' || iChar == 'Ó' || iChar == 'U'
                            || iChar == 'Ú' || iChar == 'Ü') {
                        if (!vowels.contains(String.valueOf(iChar))) {
                            vowels += iChar;
                        }
                    } else if (!consonants.contains(String.valueOf(iChar))) {
                        consonants += iChar;
                    }
                } else if (!Character.isWhitespace(iChar)) {
                    if (!symbols.contains(String.valueOf(iChar))) {
                        symbols += iChar;
                    }
                }
            }

            text = Entrada.readLine();
        }

        if (vowels.length() > 0) {
            System.out.format("Vocals: %s%n", vowels);
        }
        if (consonants.length() > 0) {
            System.out.format("Consonants: %s%n", consonants);
        }
        if (names.length() > 0) {
            System.out.format("Nombres: %s%n", names);
        }
        if (symbols.length() > 0) {
            System.out.format("Simbols: %s%n", symbols);
        }
    }
}
