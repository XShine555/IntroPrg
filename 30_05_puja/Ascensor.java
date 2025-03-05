/*
 * Iker Rivera Garcia
 * 05/03/2025
 * Clase Ascensor, que tiene un atributo pis que indica la planta en la que se encuentra el ascensor
 * y un método puja que incrementa en una unidad el valor de pis.
 */

public class Ascensor {
    int pis = -1;

    public static void puja(Ascensor ascensor) {
        ascensor.pis++;
    }
    public static void main(String[] args){
        Ascensor ascensor = new Ascensor();
        System.out.println("L'ascensor inicialment està a la planta " + ascensor.pis);
        puja(ascensor);
        System.out.println("L'ascensor finalment està a la planta " + ascensor.pis);
    }
}