/*
 * Exercici 16_09. Cadena continua
 * Iker Rivera Garcia
 * 09/12/2024
 * Muestra un número de caracteres de un texto.
 */

public class CadenaContinua {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        if (text.isEmpty()) {
            System.out.println("error");
        } else {
            System.out.println("Nombre?");
            int num = Integer.parseInt(Entrada.readLine());

            mostraCadenaContinua(text, num);
        }
    } 
    
    public static void mostraCadenaContinua(String text, int longitud) {
        int textLen = text.length();

        String result = "";

        for (int i = 0; i < longitud; i++) {
            char iChar = text.charAt(i % textLen);
            result += iChar;
        }

        System.out.println(result);
    }
}
