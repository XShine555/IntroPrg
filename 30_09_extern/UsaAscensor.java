/*
 * Iker Rivera Garcia
 * 12/03/2025
 * UsaAscensor.java, Usa la classe Ascensor per a mostrar el pis inicial de l'ascensor.
 */

public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.format("L'ascensor creat des de fora està al pis %s%n", ascensor.pis);
    }
}
