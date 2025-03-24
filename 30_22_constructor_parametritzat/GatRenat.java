/*
 * Iker Rivera Garcia
 * 24/03/2025
 * Clase GatRenat, que tiene un atributo, vides, y un constructor que inicializa el atributo.
 */

public class GatRenat {
    private int vides;
    private String posicio;
    
    public GatRenat(int novesVides, String posicio) {
        vides = novesVides;
        this.posicio = posicio;
    }

    public int getVides() 
    { 
        return vides; 
    }

    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }

    public static void main(String[] args) {
        GatRenat renat = new GatRenat(7, "estirat");
        System.out.println(renat);
    }
}