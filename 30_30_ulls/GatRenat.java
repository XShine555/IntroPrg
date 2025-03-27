/*
 * Iker Rivera Garcia
 * 26/03/2025
 * Clase GatRenat, que tiene dos atributos, vides y posicio, y un constructor que inicializa los atributos.
 */

public class GatRenat {
    private UllDeGat ullDret = new UllDeGat();
    private UllDeGat ullEsquerre = new UllDeGat();

    public UllDeGat getUllDret() { return ullDret; }
    public UllDeGat getUllEsquerre() { return ullEsquerre; }

    public void aixecat() {
        setPosicio("dret");
        ullDret.obrir();
        ullEsquerre.obrir();
    }

    public void estirat() {
        setPosicio("estirat");
        ullDret.tancar();
        ullEsquerre.tancar();
    }

    public void seu() {
        setPosicio("assegut");
        ullDret.obrir();
        ullEsquerre.tancar();
    }

    private int vides;
    private String posicio = "estirat";

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
        GatRenat renat = new GatRenat();
        UllDeGat ullDret = renat.getUllDret();
        UllDeGat ullEsquerre = renat.getUllEsquerre();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
        renat.seu();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
        renat.aixecat();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
    }
}
