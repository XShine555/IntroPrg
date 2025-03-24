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
        this.vides = vides;
        this.posicio = posicio;
    }

    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }

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
