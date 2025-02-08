/*
 * Iker Rivera Garcia
 * 08/02/2025
 * Clase Subcadenes, contiene un metodo main que pide un texto y llama a un metodo que muestra las subcadenas del texto usando recursividad.
 */

public class Subcadenes {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        text = cleanString(text);
        preOrdre(text);
    }    

    public static String cleanString(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char iChar = text.charAt(i);
            if (Character.isLetter(iChar))
                result += iChar;
        }

        return result;
    }

    public static void preOrdre(String text) {
        System.out.printf("%4d: %s%n", text.length(), text);
        if (text.length() <= 1)
            return;
        int mid = text.length() / 2;
        preOrdre(text.substring(0, mid));
        preOrdre(text.substring(mid));
    }
}
