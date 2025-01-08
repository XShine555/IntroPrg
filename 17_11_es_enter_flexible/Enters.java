/*
 * Exercici 17_11. És enter (flexible)
 * Iker Rivera Garcia
 * Programa que indica si un texto es entero o no (ampliación).
 */

 public class Enters {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();

        while (!text.isBlank()) {
            if (EsEnter.esEnter(text, false)) {
                System.out.println("És enter");
            } else {
                System.out.println("No és enter");
            }
        }

        System.out.println("Adéu");
    }
}