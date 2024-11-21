/*
 * Exercici 14_14. Distribuidor
 * Iker Rivera Garcia
 * 18/11/2024
 * Distribuye los caracteres por su categoría.
 */

public class Distribuidor {
    public static void main(String[] args) {
        System.out.println("Introduïu texts (INTRO per finalitzar)");
        String text = Entrada.readLine();

        String vowels = "", consonants = "", names = "", symbols = "";

        while (!text.isBlank()) {
            for (int i = 0; i < text.length(); i++) {
                char iChar = text.charAt(i);

                if (Character.isDigit(iChar)) {
                    // String.Contains
                    boolean containsChar = false;
                    for (int j = 0; j < names.length() - 1; j++) {
                        var jChar = names.charAt(i);
                        if (iChar == jChar) {
                            containsChar = true;
                            break;
                        }
                    }
                    if (!containsChar) {
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
                        // String.Contains
                        boolean containsChar = false;
                        for (int j = 0; j < vowels.length() - 1; j++) {
                            var jChar = vowels.charAt(i);
                            if (iChar == jChar) {
                                containsChar = true;
                                break;
                            }
                        }
                        if (!containsChar) {
                            vowels += upperChar;
                        }
                    } else {
                        // String.Contains
                        boolean containsChar = false;
                        for (int j = 0; j < consonants.length() - 1; j++) {
                            var jChar = consonants.charAt(i);
                            if (iChar == jChar) {
                                containsChar = true;
                                break;
                            }
                        }
                        if (!containsChar) {
                            consonants += upperChar;
                        }
                    }
                } else if (!Character.isWhitespace(iChar)) {
                    // String.Contains
                    boolean containsChar = false;
                    for (int j = 0; j < symbols.length() - 1; j++) {
                        var jChar = symbols.charAt(i);
                        if (iChar == jChar) {
                            containsChar = true;
                            break;
                        }
                    }
                    if (!containsChar) {
                        consonants += iChar;
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
            System.out.format("Símbols: %s%n", symbols);
        }
    }
}