/*
 * Iker Rivera Garcia
 * 26/03/2025
 * Clase GatRenat, que tiene dos atributos, vides y posicio, y un constructor que inicializa los atributos.
 */

public class GatRenat {
    private int vides;
    private String posicio = "estirat";
    private Picarol picarol;

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

    public Picarol agafaPicarol(Picarol newPicarol) {
        Picarol lastPicarol = this.picarol;
        this.picarol = newPicarol;
        return lastPicarol;
    }

    public Picarol deixaPicarol() {
        Picarol lastPicarol = this.picarol;
        this.picarol = null;
        return lastPicarol;
    }

    public boolean hiHaPicarol() {
        return picarol != null;
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
        if (posicio.equals("estirat") || posicio.equals("dret") || posicio.equals("assegut")) {
            this.posicio = posicio;
        }
    }

    public String aixecat() {
        if (posicio.equals("dret"))
            return "passo de fer res";

        posicio = "dret";
        if (picarol != null) {
            picarol.sona();
        }
        return "ja m'aixeco";
    }

    public String seu() {
        if (posicio.equals("assegut"))
            return "passo de fer res";

        posicio = "assegut";
        if (picarol != null) {
            picarol.sona();
        }
        return "ja m'assec";
    }

    public String estirat() {
        if (posicio.equals("estirat"))
            return "passo de fer res";

        posicio = "estirat";
        if (picarol != null) {
            picarol.sona();
        }
        return "ja m'estiro";
    }
}