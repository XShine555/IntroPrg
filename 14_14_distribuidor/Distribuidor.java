public class Distribuidor {
    public static void main(String[] args) {
        System.out.println("Introduïu texts (INTRO per finalitzar)");
        String text = Entrada.readLine();

        String vowels = "", consonants = "", names = "", symbols = "";

        while (!text.isBlank()) {
            for (int i = 0; i < text.length(); i++) {
                char iChar = text.charAt(i);

                if (Character.isDigit(iChar)) {
                    if (!names.contains(String.valueOf(iChar))) {
                        names += iChar;
                    }
                } else if (Character.isLetter(iChar)) {
                    char upperChar = Character.toUpperCase(iChar);

                    if (upperChar == 'À' || upperChar == 'A' || upperChar == 'È' || upperChar == 'E' || upperChar == 'É'
                            || upperChar == 'I' || upperChar == 'Ï' || upperChar == 'Ò' || upperChar == 'O'
                            || upperChar == 'Ó'
                            || upperChar == 'U' || upperChar == 'Ú' || upperChar == 'Ü') {
                        if (!vowels.contains(String.valueOf(upperChar))) {
                            vowels += upperChar;
                        }
                    } else if (!consonants.contains(String.valueOf(upperChar))) {
                        consonants += upperChar;
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