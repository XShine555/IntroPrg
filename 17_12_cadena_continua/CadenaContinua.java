/*
 * Exercici 17_12. Cadena continua (modular)
 * Iker Rivera Garcia
 * Muestra un número de caracteres de un texto.
 */

 public class CadenaContinua {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        if (text.isBlank()) {
            System.out.println("error");
        } else {
            System.out.println("Nombre?");
            int num = Integer.parseInt(Entrada.readLine());
            System.out.println(UtilString.cadenaContinua(text, num));
        }
    }    
}
