/*
 * Iker Rivera Garcia
 * 29/03/2025
 * Picarol.java,
 * La clase tiene un método sona() que simula el sonido del picarol y
 * incrementa el contador de veces que ha sonado.
 */

public class Picarol {
    private int cops = 0;
    
    public void sona() {
        System.out.println("clink-clink");
        cops++;
    }

    public int vegades() {
        return cops;
    }
}