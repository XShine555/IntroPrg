/*
 * Exercici 17_10. És enter (modular)
 * Iker Rivera Garcia
 * Programa que indica si un texto es entero o no.
 */

 public class EsEnter {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();

        while (!text.isBlank()) {
            boolean isNumber = UtilString.esEnter(text);

            if (isNumber) {
                System.out.println("És enter");
            } else {
                System.out.println("No és enter");
            }

            text = Entrada.readLine();
        }

        System.out.println("Adéu");
    }
}