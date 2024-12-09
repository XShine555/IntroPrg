/*
 * Exercici 16_12. Lletres entre parèntesis
 * Iker Rivera Garcia
 * 09/12/2024
 * Programa que pone las letras dentro de paréntesis.
 */

public class Parentitza {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        parentitza(text);
    }

    public static void parentitza(String text) {
        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);

            if (Character.isLetter(iChar)) {
                System.out.format("(%s)", iChar);
            } else {
                System.out.print(iChar);
            }
        }
    }
}
