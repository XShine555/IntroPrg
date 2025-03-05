/*
 * Iker Rivera Garcia
 * 05/03/2025
 * Clase Ascensor, que representa un ascensor que es troba a la planta -1.
 */

public class Ascensor {
    int pis = -1;

    public static void main(String[] args) {
        Ascensor instance;
        instance = new Ascensor();
        System.out.format("L'ascensor està a la planta %s%n", instance.pis);
    }    
}
