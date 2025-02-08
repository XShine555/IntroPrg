/*
 * Iker Rivera Garcia
 * 08/02/2025
 * Clase SumaDigits, contiene un metodo main que pide un texto y llama a un metodo que suma los digitos del texto y los devuelve usando recursividad.
 */
public class SumaDigits {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        int nombres = sumaDigits(text);
        System.out.println(nombres);
    }

    public static int sumaDigits(String text) {
        // cas base
        if (text.isEmpty())
            return 0;

        // tracta pas actual
        char c = text.charAt(0);

        // tracta pas recursiu
        int nombres = sumaDigits(text.substring(1));

        // composa resultat
        if (c >= '0' && c <= '9')
            return c - '0' + nombres;
        else
            return nombres;
    }
}