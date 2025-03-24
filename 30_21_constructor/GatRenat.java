/*
 * Iker Rivera Garcia
 * 24/03/2025
 * Clase GatRenat, que tiene dos atributos, vides y posicio, y un constructor que inicializa los atributos.
 */

public class GatRenat {
    private int vides;
    private String posicio;

    public GatRenat() {
        vides = 7;
        posicio = "estirat";
    }

    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    public int getVides() 
    { 
        return vides; 
    }

    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println(renat);
    }
}