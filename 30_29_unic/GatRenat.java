/*
 * Iker Rivera Garcia
 * 26/03/2025
 * Clase GatRenat, que tiene dos atributos, vides y posicio, y un constructor que inicializa los atributos.
 */

 public class GatRenat {
    private static GatRenat instancia;

    private int vides;
    private String posicio = "estirat";

    private GatRenat() {
        this(7, "estirat");
    }

    private GatRenat(int vides) {
        this(vides, "estirat");
    }

    private GatRenat(String posicio) {
        this(7, posicio);
    }

    public static GatRenat getInstancia() {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        return instancia;
    }

    public static GatRenat getInstancia(int vides) {
        var result = getInstancia();
        result.setVides(vides);
        return result;
    }

    public static GatRenat getInstancia(String novaPosicio) {
        var result = getInstancia();
        result.setPosicio(novaPosicio);
        return result;
    }

    public static GatRenat getInstancia(int vides, String posicio) {
        var result = getInstancia();
        result.setVides(vides);
        result.setPosicio(posicio);
        return result;
    }

    private GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
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
        if (posicio.equals("estirat") || posicio.equals("dret") || posicio.equals("assegut"))
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
