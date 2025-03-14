/*
 * Iker Rivera Garcia
 * 12/03/2025
 * UsaAscensor.java, Usa la classe Ascensor per a mostrar el pis inicial de l'ascensor.
 */
public class UsaAscensor {
    public static void main(String[] args) {
        var ascensor = new Ascensor();
        System.out.format("Pis inicial: %s%n", ascensor.pis);
        System.out.format("Moviment inicial: %s%n", ascensor.moviment);
        ascensor.moviment = "pujant";
        System.out.format("Moviment final: %s%n", ascensor.moviment);
    }   
}
