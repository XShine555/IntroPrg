/*
 * Iker Rivera Garcia
 * 26/03/2025
 * Clase GatRenat, que tiene dos atributos, vides y posicio, y un constructor que inicializa los atributos.
 */

public class GatRenat {
    private int vides;
    private String posicio;

    public GatRenat() {
        this(7, "estirat");
    }

    public GatRenat(int vides) {
        this(vides, "estirat");
    }

    public GatRenat(String posicio) {
        this(7, posicio);
    }

    public GatRenat(int vides, String posicio) {
        setVides(vides);
        if (posicio.equals("estirat") || posicio.equals("dret") || posicio.equals("assegut"))
            setPosicio(posicio);
        else
            setPosicio("estirat");
    }

    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }

    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }

    public void setVides(int vides) {
        if (vides >= 0)  {
            this.vides = vides;
        }
        else
            this.vides = 7;
    }
    public void setPosicio(String posicio) {
        this.posicio = posicio;
    }

    public static void main(String[] args) {
        GatRenat[] renats = {
            new GatRenat(),         // tot per defecte
            new GatRenat(8),        // 8 vides i posició per defecte
            new GatRenat("dret"),   // posició dret i vides per defecte
            new GatRenat(8, "dret") // 8 vides i posició dret
    
        };
        for (GatRenat renat: renats) {
            System.out.println(renat);
        }
    }
}
