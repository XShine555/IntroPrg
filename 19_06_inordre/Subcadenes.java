/*
 * Iker Rivera Garcia
 * 10/02/2025
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
            char c = text.charAt(i);
            if (Character.isLetter(c))
                result += c;
        }
        return result;
    }

    public static void preOrdre(String text) {
        if (text.length() <= 1) {
            System.out.printf("%4d: %s%n", text.length(), text);
            return;
        }
        int mid = text.length() / 2;
        preOrdre(text.substring(0, mid));
        System.out.printf("%4d: %s%n", text.length(), text);
        preOrdre(text.substring(mid));
    }
}
