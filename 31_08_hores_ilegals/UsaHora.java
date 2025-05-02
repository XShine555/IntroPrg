/*
 * Iker Rivera Garcia
 * 30/05/2025
 * Classe UsaHora, que utilitza la classe Hora i mostra com es poden produir excepcions
 * en el moment d'assignar valors a les hores, minuts i segons.
 */

public class UsaHora {
    public static void main(String[] args) {
        System.out.println("Intentarem crear una hora amb valors no vàlids");
        try {
            Hora hora = new Hora(-1, 1, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Argument il·legal!");
        }
    }
}