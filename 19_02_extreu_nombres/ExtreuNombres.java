/*
 * Iker Rivera Garcia
 * 08/02/2025
 * Clase ExtreuNombres, contiene un metodo main que pide un texto y llama a un metodo que extrae los numeros del texto y los devuelve concatenados en un string usando recursividad.
 */
public class ExtreuNombres {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nombres = extreuNombres(text);
        System.out.println(nombres);
    }

    // extreu els nombres i els retorna concatenats
    public static String extreuNombres(String text) {
        if (text.isEmpty())
            return "";

        // tracta pas actual
        char c = text.charAt(0);

        // tracta pas recursiu
        String nombres = extreuNombres(text.substring(1));

        // composa resultat
        if (c >= '0' && c <= '9')
            return c + nombres;
        else
            return nombres;
    }
}